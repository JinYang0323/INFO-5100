import java.util.Date;
import java.util.Calendar;

public class Cat extends Pet implements Boardable{
		private String hairLength;
		private Calendar startDate, endDate;
		
		public Cat(String name, String ownerName, String color, String hairLength){
			super(name, ownerName, color);
			this.hairLength = hairLength;
			startDate = Calendar.getInstance();
			endDate = Calendar.getInstance();
		}
		
		public String getHairLength() {
			return hairLength;
		}
		public String toString() {
			return "CAT: \n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex() + "\nHair: " + getHairLength();
		}

		@Override
		public void setBoardStart(int month, int day, int year) {
			startDate.set(year, month, day); 
		}

		@Override
		public void setBoardEnd(int month, int day, int year) {
			endDate.set(year, month, day); 
		}

		@Override
		public boolean boarding(int month, int day, int year) {
			Calendar calendar = Calendar.getInstance();
			calendar.set(year, month, day);
			if(calendar.compareTo(startDate) >= 0 && calendar.compareTo(endDate) <= 0)
				return true;
			return false;
		}
}
