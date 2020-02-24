public class iCloudRunner
{
   	public static void main(String[] args)
   	{
      		ITUNES iPodClassic5thgen = new iPod();
      	  ITUNES iPadPro1stgen = new iPad();
      		ITUNES iPhone5s = new iPhone();


      		System.out.println("PLUGED IN IPOD");
      		iPodClassic5thgen.isSyncingIPOD();
      		iPodClassic5thgen.EjectIPOD();
      		iPodClassic5thgen.newiPod();
      		iPodClassic5thgen.RESETiPod();
      		iPodClassic5thgen.restoreIPODosIPC();
          iPodClassic5thgen.fileCheckeriPod();

      		System.out.println();


          System.out.println("PLUGED IN IPAD");
              		iPadPro1stgen.isSyncingIPAD();
              		iPadPro1stgen.EjectIPAD();
              		iPadPro1stgen.newiPad();
              		iPadPro1stgen.RESETiPad();
              		iPadPro1stgen.restoreIOSiPad();
              		iPadPro1stgen.fileCheckeriPad();

          System.out.println();

         System.out.println("PLUGED IN IPHONE");
              		iPhone5s.isSyncingIPHONE();
              		iPhone5s.EjectIPHONE();
              		iPhone5s.newiPhone();
             		  iPhone5s.RESETiPhone();
              		iPhone5s.restoreIOSiPhone();
              	  iPhone5s.fileCheckeriPhone();

              		System.out.println();

                }
              }
