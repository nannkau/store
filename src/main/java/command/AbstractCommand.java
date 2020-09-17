package command;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class AbstractCommand<E> implements Serializable {
   private int page=1;
   private int maxResult=10;
   private int maxNavigationPage=10;
   private List<E> listResutl;
   private Map<String, E> mapResutl;

    public Map<String, E> getMapResutl() {
        return mapResutl;
    }

    public void setMapResutl(Map<String, E> mapResutl) {
        this.mapResutl = mapResutl;
    }

    public List<E> getListResutl() {
        return listResutl;
    }

    public void setListResutl(List<E> listResutl) {
        this.listResutl = listResutl;
    }
}
