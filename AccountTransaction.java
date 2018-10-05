package Parallelproject.org.caape;
import Parallelproject.org.caape.Account;
import Parallelproject.org.caape.Customer;
public class AccountTransaction {




		public Account findAccount(long accountNo,Customer customer) {
			
			
			for(Account account:customer.getAccount()) {
				if(account!=null) {
					if(account.getAccountNo()==accountNo) {
						return account;
					}
				}
			}
			
			return null;
		}
		
		
		public boolean isValidAccount(long accountNo,Customer customer) {
			boolean flag=false;
			
			for(Account account:customer.getAccount()) {
				if(account!=null) {
					if(account.getAccountNo()==accountNo) {
						flag=true;
						break;
					}
				}
			}
			
			return flag;
		}
		
		
		
		
		public static long generateAccountNo() {
			return (long)(Math.random()*10000)/10;
		}
		
		public void printAccounts(Customer customer) {
			Account[] accounts=customer.getAccount();
			for(Account account:accounts) {
				if(account!=null)
					System.out.println(account.getAccountNo()+"\t"+account.getAccountType());
				else
					break;
			}
		}
		
	}


}
