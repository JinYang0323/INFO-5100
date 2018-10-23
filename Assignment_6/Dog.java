import java.util.Calendar;

public class Dog extends Pet implements Boardable{
		private String size;
		private Calendar startDate, endDate;
		
		public Dog(String name, String ownerName, String color, String size){
			super(name, ownerName, color);
			this.size = size;
			startDate = Calendar.getInstance();
			endDate = Calendar.getInstance();
		}
		
		public String getSize() {
			return size;
		}
		public String toString() {
			return "DOG: \n" + getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColor() + "\nSex: " + getSex() + "\nSize: " + getSize();
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
