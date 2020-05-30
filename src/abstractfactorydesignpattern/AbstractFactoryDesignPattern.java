/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydesignpattern;

/**
 *
 * @author PC HOME
 */
public class AbstractFactoryDesignPattern {

    /**
     * @param args the command line arguments
     */
    static int x=0;
    public static void main(String[] args) {
     testAbstractFactory();
    }
    private static void testAbstractFactory() {
        //ComputerFactory.getComputer() //static take AbstractFactory  such as
        // PCFactory , ServerFactory ,ComputerFactory then call create() and return Computer
      
		Computer pc =ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
//               String s="Shimaa";
//               String ss=new String("hend");
//               s=ss;
//               ss="hend";
//               s="hend";
//               System.out.println(s==ss);
               
	}
    
}
