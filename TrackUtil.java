import java.util.HashMap;
import java.util.Set;

public class TrackUtil {

  public static void main (String[] args) {

  HashMap<String,String> trackList = new HashMap<String, String>();

  trackList.put("song", "LaLaLa LA");
  trackList.put("song2", "LaLaLa LA2");
  trackList.put("song3", "LaLaLa LA3");
  trackList.put("song4", "LaLaLa LA4");

  String name = trackList.get("song");
  System.out.println(name);

  Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));  

// 

  
}
}
}

