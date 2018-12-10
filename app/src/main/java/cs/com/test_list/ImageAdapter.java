package cs.com.test_list;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by ChenShuai on 2018/12/10/010.
 */

public class ImageAdapter extends BaseMultiItemQuickAdapter<MultipleItem, BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public ImageAdapter(List<MultipleItem> data) {
        super(data);
        addItemType(MultipleItem.IMG1, R.layout.item_img1);
        addItemType(MultipleItem.IMG2, R.layout.item_img2);
        addItemType(MultipleItem.IMG3, R.layout.item_img3);

    }

    @Override
    protected void convert(BaseViewHolder helper, final MultipleItem item) {

        switch (helper.getItemViewType()) {
            case MultipleItem.IMG1:
                Glide.with(mContext).load(item.getImageList().get(0)).into((ImageView) helper.getView(R.id.iv_item1_photo1));
                break;
            case MultipleItem.IMG2:
                Glide.with(mContext).load(item.getImageList().get(0)).into((ImageView) helper.getView(R.id.iv_item2_photo2));
                Glide.with(mContext).load(item.getImageList().get(1)).into((ImageView) helper.getView(R.id.iv_item2_photo3));

                helper.setOnClickListener(R.id.iv_item2_photo2, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("TTT", item.getImageList().get(0));
                    }
                });
                helper.setOnClickListener(R.id.iv_item2_photo3, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("TTT", item.getImageList().get(1));
                    }
                });

                break;
            case MultipleItem.IMG3:
                Glide.with(mContext).load(item.getImageList().get(0)).into((ImageView) helper.getView(R.id.iv_item3_photo1));
                Glide.with(mContext).load(item.getImageList().get(1)).into((ImageView) helper.getView(R.id.iv_item3_photo2));
                Glide.with(mContext).load(item.getImageList().get(2)).into((ImageView) helper.getView(R.id.iv_item3_photo3));
                break;
        }
    }
}
