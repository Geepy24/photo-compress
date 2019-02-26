package photoUtils;

import java.util.Scanner;

import net.coobird.thumbnailator.Thumbnails;

public class photo {
	
	/**
	 * 
	 * @param photoPath1 要压缩的图片位置
	 * @param photoPath2 压缩后的图片位置
	 * @param size 压缩的比例，0～1之间
	 * @param quality 压缩的质量 0～1之间
	 */
	public static void compressPhoto(String photoPath1,String photoPath2,String size,String quality ) {
		try {
			
			float arg1 =Float.parseFloat(size) ;
			float arg2 = Float.parseFloat(quality) ;
			if(arg1>1f || arg1 < 0) {
				throw new Exception() ;
			}
			if(arg2>1f || arg2 < 0) {
				throw new Exception() ;
			}
			
			Thumbnails.of(photoPath1).scale(arg1).outputQuality(arg2).toFile(photoPath2);
			System.out.println("压缩成功");
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("压缩失败,请检查参数的输入是否正确以及路径是否存在");
		}
		
	}
	
		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in); 
//			
//			System.out.println("请按以下顺序输入参数，参数之间用###分割，回车键确认");
//			System.out.println("1.要压缩的图片位置");
//			System.out.println("2.压缩后的图片位置");
//			System.out.println("3.压缩的比例，0～1之间");
//			System.out.println("4.压缩的质量 0～1之间");
//			String[] content = scan.nextLine().split("###");   
//			scan.close();
//			if(content.length < 4) {
//				System.out.println("请按要求输入参数！");
//				return ;
//			}
//			String path1 = content[0] ;
//			String path2 = content[1] ;
//			String size = content[2] ;
//			String quality = content[3] ;
//			
//			
//			compressPhoto(path1,path2,size,quality);
			compressPhoto("/Users/mac/Downloads/IMG_0174.jpg", "/Users/mac/Downloads/touxiang.jpg", "0.75", "0.75");
		}
	

}
