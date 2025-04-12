/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.EndIconDelegate;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener;

class EndCompoundLayout$2
implements TextInputLayout$OnEditTextAttachedListener {
    final /* synthetic */ EndCompoundLayout this$0;

    public EndCompoundLayout$2(EndCompoundLayout endCompoundLayout) {
        this.this$0 = endCompoundLayout;
    }

    public void onEditTextAttached(TextInputLayout object) {
        EditText editText;
        Object object2 = EndCompoundLayout.access$000(this.this$0);
        if (object2 == (editText = ((TextInputLayout)((Object)object)).getEditText())) {
            return;
        }
        object2 = EndCompoundLayout.access$000(this.this$0);
        if (object2 != null) {
            object2 = EndCompoundLayout.access$000(this.this$0);
            editText = EndCompoundLayout.access$100(this.this$0);
            object2.removeTextChangedListener((TextWatcher)editText);
            object2 = EndCompoundLayout.access$000(this.this$0).getOnFocusChangeListener();
            editText = this.this$0.getEndIconDelegate().getOnEditTextFocusChangeListener();
            if (object2 == editText) {
                object2 = EndCompoundLayout.access$000(this.this$0);
                editText = null;
                object2.setOnFocusChangeListener(null);
            }
        }
        object2 = this.this$0;
        object = ((TextInputLayout)((Object)object)).getEditText();
        EndCompoundLayout.access$002((EndCompoundLayout)((Object)object2), (EditText)object);
        object = EndCompoundLayout.access$000(this.this$0);
        if (object != null) {
            object = EndCompoundLayout.access$000(this.this$0);
            object2 = EndCompoundLayout.access$100(this.this$0);
            object.addTextChangedListener((TextWatcher)object2);
        }
        object = this.this$0.getEndIconDelegate();
        object2 = EndCompoundLayout.access$000(this.this$0);
        ((EndIconDelegate)object).onEditTextAttached((EditText)object2);
        object = this.this$0;
        object2 = ((EndCompoundLayout)((Object)object)).getEndIconDelegate();
        EndCompoundLayout.access$200((EndCompoundLayout)((Object)object), (EndIconDelegate)object2);
    }
}

