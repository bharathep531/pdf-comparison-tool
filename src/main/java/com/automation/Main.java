package com.automation;

import java.io.IOException;

import com.automation.utility.CompareMode;
import com.automation.utility.PDFAutomation;

public final class Main {

	public static void main(String[] args) throws IOException {
		
	//	if(args.length<2){
	//		showUsage();
	//	}else{
			PDFAutomation PDFAutomation = new PDFAutomation();
			PDFAutomation.setCompareMode(CompareMode.TEXT_MODE);
			
			if(true){
				PDFAutomation.highlightPdfDifference(true);
				PDFAutomation.setImageDestinationPath("C:\\Users\\SIRISHA\\Desktop\\");				
			}

			PDFAutomation.compare("1.pdf", "2.pdf");
	//	}
		
	}

	private static void showUsage(){
		System.out.println("Usage: java -jar pdf-util.jar file1.pdf file2.pdf [Optional:image-destination-path]");
	}
}
