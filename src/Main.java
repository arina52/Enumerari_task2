class Main{
    public static void main(String[] args) {
        System.out.println(Weekday.MONDAY.isWeekDay());
    }

    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        public boolean isWeekDay() {
            switch(this) {
                case MONDAY : return true;
                case TUESDAY : return true;
                case WEDNESDAY : return true;
                case THURSDAY : return true;
                case FRIDAY : return true;
                case SATURDAY : return false;
                case SUNDAY : return false;
                default: return false;
            }
        }
        public boolean isHoliday() {
            switch(this) {
                case MONDAY : return false;

                case TUESDAY : return false;
                case WEDNESDAY : return false;
                case THURSDAY : return false;
                case FRIDAY : return false;
                case SATURDAY : return true;
                case SUNDAY : return true;
                default: return false;
            }
        }
    }
}
