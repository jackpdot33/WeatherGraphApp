import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display{
	
	
	private static ImageIcon image1;
	private JLabel label;
	private String calendarString;
	private String fileName;
	
	void write() throws IOException{
		//image = new ImageIcon(getClass().getResource("US_4-13-20.png"));
		//label = new JLabel(image);
		//add(label);
		
			//Image image = null;
			//try {
			//URL url = new URL("https://forecast.weather.gov/wwamap/png/US.png");
			//image = ImageIO.read(url);
			//} catch(IOException e) {
			//}
		
		URL url = new URL("https://forecast.weather.gov/wwamap/png/US.png");
		InputStream in = new BufferedInputStream(url.openStream());
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1!=(n=in.read(buf)))
		{
		   out.write(buf, 0, n);
		}
		out.close();
		in.close();
		byte[] response = out.toByteArray();
		
		Date d = new Date();
		String calendarStringRaw = d.toString();
		System.out.println(calendarStringRaw);
		String calendarStringNoColon = calendarStringRaw.replace(":", "");
		System.out.println(calendarStringNoColon);
		calendarString = calendarStringNoColon.replace("\\s+","");
		String tempString = "";
		
		for(int i = 0; i < 3; i++) {
			tempString = tempString + calendarString.substring(0, calendarString.indexOf(" "));
			calendarString = calendarString.substring(calendarString.indexOf(" ")+1);
		}
		
		calendarString = tempString.substring(3);
		System.out.println(calendarString); 
		fileName = "C:\\Users\\jackp\\OneDrive\\Pictures\\WeatherGraphs\\weather_graph" + calendarString + ".jpg";
		
		//"C:\\Users\\jackpdot\\Pictures\\borrowed_image.jpg"
		
		FileOutputStream fos = new FileOutputStream(fileName);
		fos.write(response);
		fos.close();
		
		
		
		//Need YEAR, WEEK_OF_MONTH, DAY_OF_MONTH to organize graphs by date
	}
	
	public void mainPage() {
		JFrame frame = new JFrame("Weather Graph");
		JPanel panel = new JPanel();
		
		JButton button1 = new JButton("Jan");
		JButton button2 = new JButton("Feb");
		JButton button3 = new JButton("Mar");
		JButton button4 = new JButton("Apr");
		JButton button5 = new JButton("May");
		JButton button6 = new JButton("Jun");
		JButton button7 = new JButton("Jul");
		JButton button8 = new JButton("Aug");
		JButton button9 = new JButton("Sep");
		JButton button10 = new JButton("Oct");
		JButton button11 = new JButton("Nov");
		JButton button12 = new JButton("Dec");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		
		panel.setLayout(new GridLayout(12, 1));
		frame.add(panel);
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("Jan");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				twentyEightDays("Feb");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("Mar");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyDays("Apr");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("May");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyDays("Jun");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("Jul");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("Aug");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyDays("Sep");
			}
		});
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("Oct");
			}
		});
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyDays("Nov");
			}
		});
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				thirtyOneDays("Dec");
			}
		});
		
			
			}
	
	public void twentyEightDays(String month) {
		JFrame frame = new JFrame("Weather Graph");
		JPanel panel = new JPanel(new GridLayout(6, 5));
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button10 = new JButton("10");
		JButton button11 = new JButton("11");
		JButton button12 = new JButton("12");
		JButton button13 = new JButton("13");
		JButton button14 = new JButton("14");
		JButton button15 = new JButton("15");
		JButton button16 = new JButton("16");
		JButton button17 = new JButton("17");
		JButton button18 = new JButton("18");
		JButton button19 = new JButton("19");
		JButton button20 = new JButton("20");
		JButton button21 = new JButton("21");
		JButton button22 = new JButton("22");
		JButton button23 = new JButton("23");
		JButton button24 = new JButton("24");
		JButton button25 = new JButton("25");
		JButton button26 = new JButton("26");
		JButton button27 = new JButton("27");
		JButton button28 = new JButton("28");
		JButton backButton = new JButton("Back");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		panel.add(button25);
		panel.add(button26);
		panel.add(button27);
		panel.add(button28);
		panel.add(backButton);
		
		frame.add(panel);
		frame.setSize(800, 600);
		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "01");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "02");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "03");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "04");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "05");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "06");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "07");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "08");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "09");
			}
		});
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "10");
			}
		});
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "11");
			}
		});
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "12");
			}
		});
		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "13");
			}
		});
		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "14");
			}
		});
		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "15");
			}
		});
		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "16");
			}
		});
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "17");
			}
		});
		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "18");
			}
		});
		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "19");
			}
		});
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "20");
			}
		});
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "21");
			}
		});
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "22");
			}
		});
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "23");
			}
		});
		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "24");
			}
		});
		button25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "25");
			}
		});
		button26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "26");
			}
		});
		button27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "27");
			}
		});
		button28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "28");
			}
		});
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainPage();
			}
		});
	}
	
	public void thirtyDays(String month) {
		JFrame frame = new JFrame("Weather Graph");
		JPanel panel = new JPanel(new GridLayout(6, 5));
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button10 = new JButton("10");
		JButton button11 = new JButton("11");
		JButton button12 = new JButton("12");
		JButton button13 = new JButton("13");
		JButton button14 = new JButton("14");
		JButton button15 = new JButton("15");
		JButton button16 = new JButton("16");
		JButton button17 = new JButton("17");
		JButton button18 = new JButton("18");
		JButton button19 = new JButton("19");
		JButton button20 = new JButton("20");
		JButton button21 = new JButton("21");
		JButton button22 = new JButton("22");
		JButton button23 = new JButton("23");
		JButton button24 = new JButton("24");
		JButton button25 = new JButton("25");
		JButton button26 = new JButton("26");
		JButton button27 = new JButton("27");
		JButton button28 = new JButton("28");
		JButton button29 = new JButton("29");
		JButton button30 = new JButton("30");
		JButton backButton = new JButton("Back");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		panel.add(button25);
		panel.add(button26);
		panel.add(button27);
		panel.add(button28);
		panel.add(button29);
		panel.add(button30);
		panel.add(backButton);
		
		frame.add(panel);
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "01");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "02");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "03");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "04");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "05");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "06");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "07");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "08");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "09");
			}
		});
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "10");
			}
		});
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "11");
			}
		});
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "12");
			}
		});
		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "13");
			}
		});
		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "14");
			}
		});
		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "15");
			}
		});
		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "16");
			}
		});
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "17");
			}
		});
		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "18");
			}
		});
		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "19");
			}
		});
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "20");
			}
		});
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "21");
			}
		});
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "22");
			}
		});
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "23");
			}
		});
		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "24");
			}
		});
		button25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "25");
			}
		});
		button26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "26");
			}
		});
		button27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "27");
			}
		});
		button28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "28");
			}
		});
		button29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "29");
			}
		});
		button30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "30");
			}
		});
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainPage();
			}
		});
	}
	
	public void thirtyOneDays(String month) {
		JFrame frame = new JFrame("Weather Graph");
		JPanel panel = new JPanel(new GridLayout(7, 5));
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button10 = new JButton("10");
		JButton button11 = new JButton("11");
		JButton button12 = new JButton("12");
		JButton button13 = new JButton("13");
		JButton button14 = new JButton("14");
		JButton button15 = new JButton("15");
		JButton button16 = new JButton("16");
		JButton button17 = new JButton("17");
		JButton button18 = new JButton("18");
		JButton button19 = new JButton("19");
		JButton button20 = new JButton("20");
		JButton button21 = new JButton("21");
		JButton button22 = new JButton("22");
		JButton button23 = new JButton("23");
		JButton button24 = new JButton("24");
		JButton button25 = new JButton("25");
		JButton button26 = new JButton("26");
		JButton button27 = new JButton("27");
		JButton button28 = new JButton("28");
		JButton button29 = new JButton("29");
		JButton button30 = new JButton("30");
		JButton button31 = new JButton("31");
		JButton backButton = new JButton("Back");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		panel.add(button15);
		panel.add(button16);
		panel.add(button17);
		panel.add(button18);
		panel.add(button19);
		panel.add(button20);
		panel.add(button21);
		panel.add(button22);
		panel.add(button23);
		panel.add(button24);
		panel.add(button25);
		panel.add(button26);
		panel.add(button27);
		panel.add(button28);
		panel.add(button29);
		panel.add(button30);
		panel.add(button31);
		panel.add(backButton);
		
		frame.add(panel);
		frame.setSize(600, 600);
		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "01");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "02");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "03");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "04");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "05");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "06");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "07");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "08");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "09");
			}
		});
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "10");
			}
		});
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "11");
			}
		});
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "12");
			}
		});
		button13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "13");
			}
		});
		button14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "14");
			}
		});
		button15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "15");
			}
		});
		button16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "16");
			}
		});
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "17");
			}
		});
		button18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "18");
			}
		});
		button19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "19");
			}
		});
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "20");
			}
		});
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "21");
			}
		});
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "22");
			}
		});
		button23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "23");
			}
		});
		button24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "24");
			}
		});
		button25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "25");
			}
		});
		button26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "26");
			}
		});
		button27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "27");
			}
		});
		button28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "28");
			}
		});
		button29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "29");
			}
		});
		button30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "30");
			}
		});
		button31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonListener(month, "31");
			}
		});
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainPage();
			}
		});
	}
	
	public void buttonListener(String month, String day) {
		show(month, day);
	}
	
	public static void show(String month, String day) {
		image1 = new ImageIcon("C:\\Users\\jackp\\OneDrive\\Pictures\\WeatherGraphs\\weather_graph" + month + day + ".jpg");
		
		Date d = new Date();
		System.out.println(d);
		
		JButton button1 = new JButton("Back");
		JButton button2 = new JButton("Next");
		JFrame frame = new JFrame("Weather Graph");
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		
		
		JLabel weatherGraph = new JLabel(image1);
		panel.add(button1);
		panel.add(weatherGraph);
		panel.add(button2);
		frame.add(panel);
		frame.setSize(800, 600);
		//frame.add(button1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
		int monthNum = convertMonthStringToNum(month);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPreviousDay(monthNum, day);
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNextDay(monthNum, day);
			}
		});
	}
	
	public static int convertMonthStringToNum(String month) {
		int monthNum = 0;
		switch (month) {
		case "Jan":
			monthNum = 1;
			break;
		case "Feb":
			monthNum = 2;
			break;
		case "Mar":
			monthNum = 3;
			break;
		case "Apr":
			monthNum = 4;
			break;
		case "May":
			monthNum = 5;
			break;
		case "Jun":
			monthNum = 6;
			break;
		case "Jul":
			monthNum = 7;
			break;
		case "Aug":
			monthNum = 8;
			break;
		case "Sep":
			monthNum = 9;
			break;
		case "Oct":
			monthNum = 10;
			break;
		case "Nov":
			monthNum = 11;
			break;
		case "Dec":
			monthNum = 12;
			break;
		}
		
		return monthNum;
	}
	
	public static String convertMonthNumToString(String monthNum) {
		String month = "";
		switch (monthNum) {
		case "1":
			month = "Jan";
			break;
		case "2":
			month = "Feb";
			break;
		case "3":
			month = "Mar";
			break;
		case "4":
			month = "Apr";
			break;
		case "5":
			month = "May";
			break;
		case "6":
			month = "Jun";
			break;
		case "7":
			month = "Jul";
			break;
		case "8":
			month = "Aug";
			break;
		case "9":
			month = "Sep";
			break;
		case "10":
			month = "Oct";
			break;
		case "11":
			month = "Nov";
			break;
		case "12":
			month = "Dec";
			break;
		}
		
		return month;
	}
	
	public static void getPreviousDay(int monthNum, String day) {
		String newMonth = "";
		String newDay = "";
		int dayNum = Integer.parseInt(day);
		if(monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12) {
			if(dayNum == 1) {
				monthNum--;
				if(monthNum == 7) {
					newDay = "31";
					newMonth = "7";
				}
				else {
					newDay = "30";
					newMonth = monthNum + "";
				}
			}
			else if(dayNum < 10){
				newDay = "0" + dayNum--;
				newMonth = monthNum + "";
			}
			else {
				newDay = dayNum-- + "";
				newMonth = monthNum + "";
			}
		}
		else if(monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
			if(dayNum == 1) {
				newDay = "31";
				newMonth = (monthNum-1) + "";
			}
			else if(dayNum < 10){
				newDay = "0" + (dayNum-1);
				newMonth = monthNum + "";
			}
			else {
				newDay = (dayNum-1) + "";
				newMonth = monthNum + "";
			}
		}
		else {
			if(dayNum == 1) {
				newDay = "31";
				newMonth = (monthNum-1) + "";
			}
			else if(dayNum == 29){ //Leap year day
				newDay = "28";
				newMonth = monthNum + "";
			}
			else if(dayNum < 10){
				newDay = "0" + (dayNum-1);
				newMonth = monthNum + "";
			}
			else {
				newDay = (dayNum-1) + "";
				newMonth = monthNum + "";
			}
		}
		
		
		show(convertMonthNumToString(newMonth), newDay);
	}
	
	public static void getNextDay(int monthNum, String day) {
		String newMonth = "";
		String newDay = "";
		int dayNum = Integer.parseInt(day);
		if(dayNum == 31) {
			newDay = "01";
			newMonth = (monthNum+1) + "";
		}
		else if(dayNum < 9) {
			newDay = "0" + (dayNum+1);
			newMonth = monthNum + "";
		}
		else {
			newDay = (dayNum+1) + "";
			newMonth = monthNum + "";
		}
		
		show(convertMonthNumToString(newMonth), newDay);
	}
	

	public static void main(String[] args) throws IOException {
		Display d = new Display();
		d.write();
		d.mainPage();
	}

}
