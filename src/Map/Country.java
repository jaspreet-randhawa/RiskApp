package Map;

public class Country {
	 String CountryId,adjv1;
    int x,y;
   

    Country(String CountryId,int x,int y, String adjv1){
       this.CountryId = CountryId;
       this.x=x;
       this.y=y;
       this.adjv1= adjv1;
      // this.setName(name);
       
   }

   

/**
* @param gender the gender to set
*/
public void setCountryId(String CountryId) {
	this.CountryId = CountryId;
}

/**
* @return the countryID
*/
public String getCountryId() {
return CountryId;
}


public void setCoordinateX(int x) {
	this.x=x;
  // this.y=y;
}


public int getCoordinateX() {
   return x;
}

public void setCoordinateY(int y) {
	
  this.y=y;
}

public int getCoordinatey() {
   return y;
}


public String getadjv() {
   return adjv1;
}


public void setadjv(String adjv1) {
	this.adjv1= adjv1;
}

/*public int toInt(){
   return this.CountryId + " " + this.x + " " + this.y+ " " + this.adjv1;
}*/


}

