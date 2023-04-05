package adapter;

public class TableContactManager implements TableData{

    private ContactManager contactManager;

    public TableContactManager(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return contactManager.getContactCount();
    }

    @Override
    public int getColumnSpacing() {
        return 5;
    }

    @Override
    public int getRowSpacing() {
        return 0;
    }

    @Override
    public char getHeaderUnderline() {
        return '-';
    }

    @Override
    public String getColumnHeader(int col) {
        if(col == 0){
            return "First";
        } else if (col == 1){
            return "Last Name";
        } else if (col == 2){
            return "Phone";
        } else if (col == 3){
            return "E-mail";
        }
        return null;
    }

    @Override
    public int getColumnWidth(int col) {
        return 20;
    }

    @Override
    public Justification getColumnJustification(int col) {
        return Justification.Right;
    }

    @Override
    public String getCellValue(int row, int col) {
        if(col == 0){
            return contactManager.getContact(row).getFirstName();
        } else if (col == 1){
            return contactManager.getContact(row).getLastName();
        } else if (col == 2){
            return contactManager.getContact(row).getPhone();
        } else if (col == 3){
            return contactManager.getContact(row).getEmail();
        }
        return null;
    }
}
