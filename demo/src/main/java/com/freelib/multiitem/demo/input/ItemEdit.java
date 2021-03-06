package com.freelib.multiitem.demo.input;

import android.support.annotation.NonNull;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.freelib.multiitem.adapter.holder.BaseViewHolder;
import com.freelib.multiitem.demo.R;
import com.freelib.multiitem.item.BaseItemInput;

import static android.R.id.edit;

/**
 * ItemEdit
 * Created by free46000 on 2017/4/12.
 */
public class ItemEdit extends BaseItemInput<ItemEdit> {
    private EditText editText;
    public String name;
    public String defValue;
    private String hint;


    /**
     * @param key 录入对应key
     */
    public ItemEdit(String key) {
        super(key);
    }

    public ItemEdit setName(String name) {
        this.name = name;
        return this;
    }

    public ItemEdit setHint(String hint) {
        this.hint = hint;
        return this;
    }

    public ItemEdit setDefValue(String defValue) {
        this.defValue = defValue;
        return this;
    }

    @NonNull
    @Override
    public String getValue() {
        String value = editText == null ? defValue : editText.getText().toString();
        return TextUtils.isEmpty(value) ? null : value;
    }

    @Override
    protected void initInputView(BaseViewHolder holder) {
        TextView nameText = getView(holder.itemView, R.id.text);
        nameText.setText(name);

        editText = getView(holder.itemView, R.id.editText);
        editText.setHint(hint);
        editText.setText(defValue);
    }

    @Override
    protected int getItemLayoutId() {
        return R.layout.item_edit;
    }

}
