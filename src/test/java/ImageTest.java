import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-28 10:43
 **/
public class ImageTest {


    public static void main(String[] args) {
        String s = "/91j/4AAQSkZJRgABAQEAlgCWAAD/2wBDAAgGBgcGBQgHBwcJCQgKDBQNDAsLDBkSEw8UHRofHh0a\\r\\nHBwgJC4nICIsIxwcKDcpLDAxNDQ0Hyc5PTgyPC4zNDL/2wBDAQkJCQwLDBgNDRgyIRwhMjIyMjIy\\r\\nMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjL/wAARCAM3BRwDASIA\\r\\nAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQA\\r\\nAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3\\r\\nODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWm\\r\\np6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEA\\r\\nAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSEx\\r\\nBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYk";
        byte[] b = s.getBytes();

        getPicture(b,"C:/Users\\Administrator\\Desktop\\BBK\\1.jpg");


    }

    public static boolean getPicture(byte[] b, String imgFilePath) {
        boolean flag = false;
        try {
            if (b != null) { // 图像数据为空
                // Base64解码
                //EDOC_ECLIENT_UTIL_LOGGER.debug("======图片的字符串大小为" + b.length + "===========");
                // 调整异常数据
                for (int i = 0; i < b.length; ++i) {
                    if (b[i] < 0) {
                        b[i] += 256;
                    }
                }
                OutputStream out = new FileOutputStream(imgFilePath);
                out.write(b);
                out.flush();
                out.close();
                flag = true;
            }
        } catch (Exception e) {
            //EDOC_ECLIENT_UTIL_LOGGER.error("==解密图片字节码异常==", e);
            e.printStackTrace();
        }
        return flag;
    }
}
