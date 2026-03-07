package collections_framework_list;

public class Student {

    private int id;
    private String name;
    private String mailid;
    private long contactnumber;

    // Non parameterized constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int id, String name, String mailid, long contactnumber) {
        this.id = id;
        this.name = name;
        this.mailid = mailid;
        this.contactnumber = contactnumber;
    }

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the mailid
	 */
	public String getMailid() {
		return mailid;
	}

	/**
	 * @param mailid the mailid to set
	 */
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	/**
	 * @return the contactnumber
	 */
	public long getContactnumber() {
		return contactnumber;
	}

	/**
	 * @param contactnumber the contactnumber to set
	 */
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}

   
}