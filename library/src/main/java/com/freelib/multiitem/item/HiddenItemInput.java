package com.freelib.multiitem.item;

import com.freelib.multiitem.adapter.holder.BaseViewHolder;

/**
 * Created by free46000 on 2017/4/13.
 */
public class HiddenItemInput extends BaseItemInput {
    protected Object value;

    /**
     * @param key 录入对应key
     */
    public HiddenItemInput(String key, Object value) {
        super(key);
        this.value = value;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, Object o) {

    }

    @Override
    protected int getItemLayoutId() {
        return 0;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    protected void initInputView(BaseViewHolder holder) {

    }
}
