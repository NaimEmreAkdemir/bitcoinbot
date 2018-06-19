package newpackage3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class Btc extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7497708674543535545L;
	private JPanel contentPane;
	JPasswordField passwordField;
	private JLabel lblBuy;
	private JLabel lblBuyAmount;
	private JLabel lblSellPrice;
	private JLabel lblSellAmount;
	private JTextField buyprice;
	private JTextField buyamount;
	private JTextField sellprice;
	private JTextField sellamount;
	JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Btc frame = new Btc();
					Btc.setDefaultLookAndFeelDecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Btc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUsername.setBounds(10, 79, 120, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(10, 125, 120, 28);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		username.setBounds(140, 79, 264, 28);
		contentPane.add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('?');
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		passwordField.setBounds(140, 127, 264, 28);
		contentPane.add(passwordField);
		
		lblBuy = new JLabel("Buy Price");
		lblBuy.setForeground(new Color(0, 128, 0));
		lblBuy.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBuy.setBounds(10, 230, 120, 28);
		contentPane.add(lblBuy);
		
		lblBuyAmount = new JLabel("Buy Amount");
		lblBuyAmount.setForeground(new Color(0, 128, 0));
		lblBuyAmount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBuyAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuyAmount.setBounds(10, 282, 120, 28);
		contentPane.add(lblBuyAmount);
		
		lblSellPrice = new JLabel("Sell Price");
		lblSellPrice.setForeground(new Color(128, 0, 0));
		lblSellPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellPrice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSellPrice.setBounds(344, 230, 120, 28);
		contentPane.add(lblSellPrice);
		
		lblSellAmount = new JLabel("Sell Amount");
		lblSellAmount.setForeground(new Color(128, 0, 0));
		lblSellAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblSellAmount.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSellAmount.setBounds(344, 282, 120, 28);
		contentPane.add(lblSellAmount);
		
		buyprice = new JTextField();
		buyprice.setForeground(new Color(0, 0, 0));
		buyprice.setHorizontalAlignment(SwingConstants.CENTER);
		buyprice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		buyprice.setBounds(140, 231, 120, 28);
		contentPane.add(buyprice);
		buyprice.setColumns(10);
		
		buyamount = new JTextField();
		buyamount.setHorizontalAlignment(SwingConstants.CENTER);
		buyamount.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		buyamount.setBounds(140, 283, 120, 28);
		contentPane.add(buyamount);
		buyamount.setColumns(10);
		
		sellprice = new JTextField();
		sellprice.setHorizontalAlignment(SwingConstants.CENTER);
		sellprice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		sellprice.setBounds(474, 230, 120, 28);
		contentPane.add(sellprice);
		sellprice.setColumns(10);
		
		sellamount = new JTextField();
		sellamount.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		sellamount.setHorizontalAlignment(SwingConstants.CENTER);
		sellamount.setBounds(474, 282, 120, 28);
		contentPane.add(sellamount);
		sellamount.setColumns(10);
		
		JButton btnGo = new JButton("GO !");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		    	WebDriver driver = new ChromeDriver() ;
		    
		    	
		    	String uname		=	username.getText()							;
				String pwd		    =	String.valueOf(passwordField.getPassword())	;
		    	String baseUrl 		= 	"https://poloniex.com/login"				;
		    	String openorder 	= 	"You have no open orders."					;
		    	String openorderurl = 	"https://poloniex.com/openOrders"			;
		    	String vrcurl		=	"https://poloniex.com/exchange#btc_bch"		;
		    	String buyprice1	=	buyprice.getText()							;
		    	String buyamount1	=	buyamount.getText()							;
		    	String sellprice1	=	sellprice.getText()							;
		    	String sellamount1	=	sellamount.getText()						;
		    	
		 
		    	
		    	
		    	driver.get(baseUrl);
		    	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		        System.out.println("...");
		      	
		        driver.findElement(By.name("username")).sendKeys(uname);
		        System.out.println("Ýsim girildi: "+uname);
		       
		        driver.findElement(By.name("password")).sendKeys(pwd);
		        System.out.println("Þifre girildi");
		       
		        driver.findElement(By.className("signUpButton")).click();
		        System.out.println("Giriþ");
		     	
		        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		        System.out.println("...");
		       
		        try {
					Thread.sleep(60000);
					System.out.println("60 sn uyku");
					} catch (InterruptedException e) {
				    e.printStackTrace();
					}
		      
		        int x=0;
		        do{			//ana döngü
		       
		    	int i=0;	
		    		do    //sipariþ varsa sürekli yeniden yükleyip kontrol ediyor
		    		{
		    	
		    	
		    	
		    			do 
		    			{
		    			
		    				driver.navigate().to(openorderurl);
		    				System.out.println("O.O.");	
		    				
		    				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    				System.out.println("..."); 
		    	        
		    				try {
		    					Thread.sleep(15000);
		    					System.out.println("15 sn uyku");
		    					} catch (InterruptedException e) {
		    						e.printStackTrace();
		    					}
		    			}
		    			while(!driver.getCurrentUrl().equals(openorderurl));
		    			
		    			
		    			Work1 oo1 = new Work1();
		    			try {
		    			oo1.element = driver.findElement(By.xpath("//*[@id='openOrdersDiv']/h2")).getText();
		    			System.out.println(oo1.element);
		    			if (oo1.element.equals(openorder)){
		    				
		    			
		    			i++;    //sipariþ olmama durumunda i'yi 1 yapýp döngüyü sonlandýrýp koda devam ediyor
		    			}
		    			
		    			else{
		    			i = 0;	//sipariþ var ve döngü devam ediyor
		    			}
		    			} catch (org.openqa.selenium.NoSuchElementException e){
		    				System.out.println("Sipariþ Beklemede");
		    			}
		    		}
		    		while(i<1);
		    		
		    		System.out.println("***********************// Bitmiþ Ýþlem Sayýsý "+x);
		    		
		    		do 			//satýn alma iþlemi baþlýyor
					{
						driver.navigate().to(vrcurl);
						System.out.println("vrc satýn alma sayfasýna yönlendirildi");	
		  
						driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
						System.out.println("..."); 
		    
						try {
							Thread.sleep(40000);
							System.out.println("40 sn uyku");
							} catch (InterruptedException e) {
							e.printStackTrace();
							}
					}
					while(!driver.getCurrentUrl().equals(vrcurl));	
			
					driver.findElement(By.id("buyRate")).clear();
		    		System.out.println("Fiyat temizlendi");
		    		
		    		driver.findElement(By.id("buyRate")).sendKeys(buyprice1);
		            System.out.println("Þu fiyattan satýn alýnýyor: "+buyprice1);
		            
		            driver.findElement(By.id("buyAmount")).sendKeys(buyamount1);
		            System.out.println("Þu kadar satýn alýnýyor: "+buyamount1);
		            
		            driver.findElement(By.id("buyAmount")).submit();			
		            
		            driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
					System.out.println("..."); 
		            try {
						Thread.sleep(20000);
						System.out.println("20 sn uyku");
						} catch (InterruptedException e) {
						e.printStackTrace();
						}
		    					//satýn alma iþlemi bitti
		            
		        	int j=0;	
		        		do    //sipariþ varsa sürekli yeniden yükleyip kontrol ediyor
		        		{
		        	
		        	
		        	
		        			do 
		        			{
		        			
		        				driver.navigate().to(openorderurl);
		        				System.out.println("O.O.");	
		        				
		        				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		        				System.out.println("..."); 
		        	        
		        				try {
		        					Thread.sleep(30000);
		        					System.out.println("30 sn uyku");
		        					} catch (InterruptedException e) {
		        						e.printStackTrace();
		        					}
		        			}
		        			while(!driver.getCurrentUrl().equals(openorderurl));
		        			System.out.println("site doðru devam ediliyor");
		        			
		        			Work1 oo2 = new Work1();
		        			try {
		        			oo2.element = driver.findElement(By.xpath("//*[@id='openOrdersDiv']/h2")).getText();
		        			System.out.println(oo2.element);
		        			if (oo2.element.equals(openorder)){
		        				
		        			
		        			j++;    //sipariþ olmama durumunda j'yi 1 yapýp döngüyü sonlandýrýp koda devam ediyor
		        			}
		        			
		        			else{
		        			j = 0;	//sipariþ var ve döngü devam ediyor
		        			}
		        			} catch (org.openqa.selenium.NoSuchElementException e){
		        				System.out.println("Sipariþ Beklemede *");
		        			}
		        			
		        		}
		        		while(j<1);
		            
		        					//satma iþlemi 
		    		
		        		do 			//satma iþlemi baþlýyor
		    			{
		    				driver.navigate().to(vrcurl);
		    				System.out.println("vrc satýn alma sayfasýna satýþ yapmak için yönlendirildi");	
		      
		    				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    				System.out.println("..."); 
		        
		    				try {
		    					Thread.sleep(60000);
		    					System.out.println("60 sn uyku");
		    					} catch (InterruptedException e) {
		    					e.printStackTrace();
		    					}
		    			}
		    			while(!driver.getCurrentUrl().equals(vrcurl));	
		    	
		    			driver.findElement(By.id("sellRate")).clear();
		        		System.out.println("Satýþ fiyatý temizlendi");
		        		
		        		driver.findElement(By.id("sellRate")).sendKeys(sellprice1);
		                System.out.println("Þu fiyattan satýlýyor: "+sellprice1);
		                
		                driver.findElement(By.id("sellAmount")).sendKeys(sellamount1);
		                System.out.println("Þu kadar satýlýyor: "+sellamount1);
		                
		                driver.findElement(By.id("sellAmount")).submit();			
		                
		                driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		    			System.out.println("..."); 
		                try {
		    				Thread.sleep(30000);
		    				System.out.println("30 sn uyku");
		    				} catch (InterruptedException e) {
		    				e.printStackTrace();
		    				}
		        					//satma iþlemi bitti
		        		x++;
		        		
		    }
			while(x<100);
		        
			
				
				
				
				
				
			}

			
		});
		btnGo.setForeground(new Color(0, 0, 128));
		btnGo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGo.setBounds(234, 344, 170, 57);
		contentPane.add(btnGo);
		
		
	}

	
}
