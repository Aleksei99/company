package java_course.company.files;

import java.io.*;


    public class Files {
        public static void main(String[] args) {
            try(InputStream in = new FileInputStream(new File("D:\\Downloads\\The.Angry.Birds.Movie.2.2019.HDRip.1.46Gb.MegaPeer\\The.Angry.Birds.Movie.2.2019.HDRip.1.46Gb.MegaPeer.avi"));
                OutputStream out = new FileOutputStream(new File("D:\\output.avi"))){
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            } catch (
                    IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

