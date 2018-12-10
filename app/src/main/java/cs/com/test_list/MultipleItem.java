package cs.com.test_list;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Created by ChenShuai on 2018/12/10/010.
 */

public class MultipleItem implements MultiItemEntity {
    public static final int IMG1 = 1;
    public static final int IMG2 = 2;
    public static final int IMG3 = 3;
    public static final int IMG4 = 3;
    public static final int IMG5 = 1;
    public static final int IMG6 = 4;
    private int itemType;
    private List<String> imageList;


    public MultipleItem(int itemType) {
        this.itemType = itemType;
    }

    public MultipleItem(int itemType, List<String> imageList) {
        this.itemType = itemType;
        this.imageList = imageList;
    }

    @Override
    public int getItemType() {
        return itemType;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }
}
