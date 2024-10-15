package tw.sean.learn;

import java.io.File;

public class Sean33 {

	public static void main(String[] args) {
		File f1 = new File("d:/dir3");  // \b  \t  \n  \f  \r  \"  \'  \\跳脫字元
		File f2 = new File("d:/test1");
		if(f1.exists()) {  //查是否存在
			System.out.println("ok");
		}else {
			System.out.println("xx");
			f1.mkdir();
				
			
		}
		
		File nowDir = new File("."); // . 代表本資料夾
		System.out.println(nowDir.getAbsolutePath());
	}

}
