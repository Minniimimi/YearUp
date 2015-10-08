
public class Bobin
{

	private String m_name = null;
	private int m_age = -1;
	private String m_address = null;
	private String m_phoneNumber = null;
	
	Bobin(String name, int age, String address, String phoneNumber)
	{
		SetName(name);
		SetAge(age);
		SetAddress(address);
		SetPhoneNumber(phoneNumber);
	}
	
	String GetName()
	{
		return m_name;
	}
	
	private void SetName(String name)
	{
		m_name = name;
	}
	
	int GetAge()
	{
		return m_age;
	}
	
	private void SetAge(int age)
	{
		m_age = age;
	}
	
	String GetAddress()
	{
		return m_address;
	}
	
	private void SetAddress(String address)
	{
		m_address = address;
	}
	
	String GetPhoneNumber()
	{
		return m_phoneNumber;
	}
	
	private void SetPhoneNumber(String phoneNumber)
	{
		m_phoneNumber = phoneNumber;
	}
	
	void GrowsOlder ()
	{
		m_age++;
	}
	
}
