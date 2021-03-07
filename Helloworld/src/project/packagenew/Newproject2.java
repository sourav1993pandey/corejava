package project.packagenew;


import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Newproject2 {

	public static void main(String[] args) throws IOException {
		
		
				Firstproject obj1=new Firstproject("Company Lockers pvt.ltd","to delvelop application");
				
				     	obj1.showMenu();
     	                
	}	  
}
      class Firstproject{
	int num=0;
	String companyname;
	String companydetails;
	
	Firstproject(String cname,String cdetails){
		companyname=cname;
		companydetails=cdetails;
		System.out.println("Welcome :"+companyname);
		System.out.println("Details :"+companydetails);
	}
      
//		 System.out.println("Enter Your choice");
//	       num=sc.nextInt();
	   
//	    String getInput()
//	    {
//     	Scanner c=new Scanner(System.in);
//     	System.out.println("Enter Title");
//     	String titleName=c.nextLine();
//     	c.close();
//     	return titleName;
//     }
//	     void displayResults(String name,List<String>titles)throws IOException {
//	    	 boolean inFile=titles.stream().anyMatch(p->p.equalsIgnoreCase(name));
//	    	 if(inFile) {
//	    		 System.out.println("\nYes"+name+"is in this file");}
//	    		 else {
//	    			 System.out.println("\nNO"+name+"not in this file");
//	    			 
//	    		 }
//	    	 }
//	     
//
//       	
	void Folderpath() {
		
		String Folderpath=("C:\\Users\\soura\\OneDrive\\Desktop\\simplylearn");
		File folder=new File(Folderpath);
		File[] files=folder.listFiles();

			
		 
		 for(File file:files) {
     		if(file.isFile()) {
     			System.out.println("File :"+file.getName());
     		}else
     			if(file.isDirectory()) {
     				System.out.println("Folder is:"+file.getName());
     			}
		 }
	} 
	void Create() throws IOException {

		File file=new File("C:\\Users\\soura\\OneDrive\\Desktop\\simplylearn\\sourav.txt");
				if(file.createNewFile()) {
			System.out.println("new file is created");
			
		}
		else
		
		{
			System.out.println("file doesnot exist");
	}
	}
		
	void Delete() {
		File file=new File("C:\\Users\\soura\\OneDrive\\Desktop\\simplylearn\\sourav.txt");
		if(file.delete()){
			System.out.println("file deleted"+file);
			
		}else {
			System.out.println("not deleted"+file);
		}
	}
	void newFile() throws IOException{
		
		//File directory=new File("C:\\Users\\soura\\OneDrive\\Desktop\\simplylearn");
//		Scanner userinput=new Scanner(System.in);
//		System.out.println("what is the file name");
//		
//		
//		String fileName=userinput.nextLine();
//		File File=new File("C:\\Users\\soura\\OneDrive\\Desktop\\simplylearn");
//		String[] fileData=new String[100];
//		int i=0;
//		while(userinput.hasNextLine()) {
//			fileData[++i]=userinput.nextLine();
//			System.out.println(fileData[i]);
//			
		File file=new File("C:\\Users\\soura\\OneDrive\\Desktop\\simplylearn");
				String[] flist=file.list();
		int flag=0	;
		if(flist==null) {
			System.out.println("Empty directory");
		}
		else {
			for(int i=0;i<flist.length;i++) {
				String filename=flist[i];
				if(filename.equalsIgnoreCase("anyday.txt")) {
					System.out.println("Found---------"+filename);
					flag=1;
				}
			}
		}
	}

//     private String newFile(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	void showMenu() throws IOException {
	char option='\0';
		
	 Scanner sc=new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("**************************************");
     System.out.println("1: Get all the File Names");
     System.out.println("*************************************");
     
     System.out.println("2: Add a file");
     System.out.println("******************************************");
     System.out.println("3: Delete a file");
     System.out.println("*****************************************");
     System.out.println("4: Search a File");
     System.out.println("*************************************");
     System.out.println("5: Navigate back");
     System.out.println("**************************************");
     System.out.println("6: Close the file");
     System.out.println("****************************************");
  
     System.out.println("\n");
     System.out.println("---------------------------------");
       
            

	


             
     do {
			System.out.println("*****************************************************************");
			System.out.println("Enter Your choice");
			System.out.println("*******************************************************************");
			option=sc.next().charAt(0);
			
			System.out.println("\n");
			
        
	        switch(option) {
	        case '1':
	        	System.out.println("*****************************");
	        	System.out.println();
	        	Folderpath();
	        	System.out.println("***************************");
	        	
	        	
	        	

	        	break;
	        	
	        	
	        	
	        case '2':
	        	System.out.println("***********************");
	        	Create();
	        	System.out.println("************************");
	        	break;
	        case'3':
	        	System.out.println("*****************************");
	        	System.out.println();
	        	Delete();
	        	System.out.println("***************************");
	        	
	        	break;
	        	
	        case'4':
	        	System.out.println("***************************");
	        	
	        	
	        	 newFile();
	        	 
                System.out.println("*************************");
                break;
	        case'5':
	        	System.out.println("**********");
	        	break;
	        	

	    		
	        	case'6':
	        		System.out.println("FILE CLOSED");
	        		
	        		System.exit(option);
	        	
	           
					
					default:
						System.out.println(" plzz Enter again FOR OPTION");			        		
	                    break;
	                    
	        	
	        }
     }
	        	
	        
      
        while(option !=6);
        	System.out.println("thank you for using our services");
	        }
	        
	        	            
      }
     
      
