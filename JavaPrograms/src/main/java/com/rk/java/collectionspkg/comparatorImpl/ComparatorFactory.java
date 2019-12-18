package com.rk.java.collectionspkg.comparatorImpl;

public class ComparatorFactory {
	
	public static IComparator getCmpObj(FieldType type) {
		
		IComparator cmp=null;
	
		switch (type) {
		
		case AGE: 
				cmp = new AgeComparator();
				break;
				
		case USER_ID:
				cmp = new UserIdComparator();
				break;
				
		case ROLE:
				cmp = new RoleComparator();
				break;
		default:
			break;
				
		}
		return cmp;
	}

}
