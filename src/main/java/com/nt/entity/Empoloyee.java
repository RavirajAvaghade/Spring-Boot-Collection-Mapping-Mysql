package com.nt.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@Table(name="EMPLOYEE_COLLECTION")
@AllArgsConstructor
@NoArgsConstructor
public class Empoloyee implements Serializable
{
   @Id
   @SequenceGenerator(name="gen1",sequenceName="EID_SEQ1",initialValue=1,allocationSize=1)
   @GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
   @Column(length=30)
   private Integer eid;
   @NonNull
   @Column(length=30)
   private String ename;
   @NonNull
   @Column(length=30)
   private String eaddrs;
   // LIST 
   @ElementCollection
   @CollectionTable(
		    name = "FRIEND_INFO_TAB",
		    joinColumns = @JoinColumn(
		        name = "EMP_ID",
		        referencedColumnName = "EID"
		    )
		)
   @Column(name="FRIEND_NAME")
   @NonNull
   private List<String> friend;
   // SET
   @ElementCollection
   @CollectionTable(
		    name = "PHONES_INFO_TAB",
		    joinColumns = @JoinColumn(
		    	     name = "EMP_ID",
		    	     referencedColumnName = "EID"
		    	 )
		    
		)
   @Column(name="PHONE_NO")
   @NonNull
   private Set<String> phones;
   // MAP
   @ElementCollection
   @CollectionTable(
		    name = "ID_INFO_TAB",
		    joinColumns = @JoinColumn(
		    	     name = "EMP_ID",
		    	     referencedColumnName = "EID"
		    	 ))
   @Column(name="ID_VALUE")
   @MapKeyColumn(name="ID_TYPE")
   @NonNull
   private Map<String,String> idderails;
  
   
}
