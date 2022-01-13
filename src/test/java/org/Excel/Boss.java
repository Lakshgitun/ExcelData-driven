package org.Excel;
import java.io.IOException;
import org.openqa.selenium.WebElement;


public class Boss {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseClass b = new BaseClass();
		b.Chrome();
		b.LoadUrl("https://adactinhotelapp.com/BookHotel.php");
		b.WinMax();
		WebElement UserTxt = b.FindbyId("username");
		b.SendValue(UserTxt, "VasanthBoss");
		WebElement UserPswrd = b.FindbyId("password");
		b.SendValue(UserPswrd, "01031993@Vv");
		WebElement BtnClick = b.FindbyId("login");
		b.btnclick(BtnClick);
		Thread.sleep(5000);	
		WebElement loc = b.FindbyId("location");
		String locEx = b.excelRead(1, "Location");
		b.visibleText(loc, locEx);
		
		WebElement hot = b.FindbyId("hotels");
		String hotEx = b.excelRead(1, "Hotels");
		b.visibleText(hot, hotEx);
		
		WebElement room = b.FindbyId("room_type");
		String roomEx = b.excelRead(1, "Room Type");
		b.visibleText(room, roomEx);
		
		WebElement submit = b.FindbyId("Submit");
		b.btnclick(submit);
		Thread.sleep(5000);
		
		WebElement radio = b.FindbyId("radiobutton_0");
		b.btnclick(radio);
		
		WebElement continue1 = b.FindbyId("continue");
		b.btnclick(continue1);
		Thread.sleep(5000);
		
		WebElement fName = b.FindbyId("first_name");
			String ExfName = b.excelRead(1, "First Name");
				b.SendValue(fName, ExfName);
		WebElement lName = b.FindbyId("last_name");
			String ExlName = b.excelRead(1, "Last Name");
				b.SendValue(lName, ExlName);
		WebElement Adrs = b.FindbyId("address");
			String ExAdrs = b.excelRead(1, "Billing Address");
				b.SendValue(Adrs, ExAdrs);
		WebElement CcNum = b.FindbyId("cc_num");
			String exCcNum = b.excelRead(1, "Credit Card No");
				b.SendValue(CcNum, exCcNum);
		WebElement Select = b.FindbyId("cc_type");
			String exType = b.excelRead(1, "CC TYPE");
				b.visibleText(Select, exType);
		WebElement CcExpM = b.FindbyId("cc_exp_month");
			String exMonth = b.excelRead(1, "CC MONTH");
				b.visibleText(CcExpM, exMonth);
		WebElement CcExpYr = b.FindbyId("cc_exp_year");
			String exYr = b.excelRead(1, "CC YEAR");
				b.visibleText(CcExpYr, exYr);
		WebElement Cvv = b.FindbyId("cc_cvv");
			String cvv = b.excelRead(1, "CVV");
				b.SendValue(Cvv, cvv);
		WebElement BookNow = b.FindbyId("book_now");
			b.btnclick(BookNow);
			Thread.sleep(5000);
			String value = b.GetAtributValue("order_no");
			System.out.println("Order Id : "+value);
			
	}
}

}
