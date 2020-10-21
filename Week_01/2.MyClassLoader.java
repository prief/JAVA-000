import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassloader extends ClassLoader{
    public static void main(String[] args) {
        try {
            Class<?> myClassloader = new MyClassloader().findClass("Hello");
            Object o = myClassloader.newInstance();
            Method m = myClassloader.getMethod("hello");
            m.invoke(o);
        } catch (ClassNotFoundException | IllegalAccessException
                | InstantiationException | NoSuchMethodException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        byte[] rawBytes = new byte[0];
        try {
            rawBytes = getBytesFromFile("./Hello.xlass");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] decodeBytes = decodeBytes(rawBytes);

        return defineClass(name, decodeBytes, 0, decodeBytes.length);
    }

    private byte[] decodeBytes(byte[] rawBytes) {
        int byteCapacity = rawBytes.length;
        byte[] decodeBytes = new byte[byteCapacity];
        for (int i = 0;  i < rawBytes.length; i++) {
            decodeBytes[i] = (byte)(255 - rawBytes[i]);
        }
        return decodeBytes;
    }

    private byte[] getBytesFromFile(String path) throws FileNotFoundException {
        File f = new File(path);
        if (!f.exists()) {
            throw new FileNotFoundException(path);
        }
        int fileLength = (int)f.length();
        byte[] bytes = new byte[fileLength];

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
             ByteArrayOutputStream bos = new ByteArrayOutputStream(fileLength)
        ){
            int bufSize = 1024;
            byte[] buffer = new byte[bufSize];
            int len;
            while (-1 != (len = in.read(buffer, 0, bufSize))) {
                bos.write(buffer, 0, len);
            }
            bytes = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

}