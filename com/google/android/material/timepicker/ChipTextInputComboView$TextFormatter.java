/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 */
package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.ChipTextInputComboView$1;

class ChipTextInputComboView$TextFormatter
extends TextWatcherAdapter {
    private static final String DEFAULT_TEXT = "00";
    final /* synthetic */ ChipTextInputComboView this$0;

    private ChipTextInputComboView$TextFormatter(ChipTextInputComboView chipTextInputComboView) {
        this.this$0 = chipTextInputComboView;
    }

    public /* synthetic */ ChipTextInputComboView$TextFormatter(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView$1 chipTextInputComboView$1) {
        this(chipTextInputComboView);
    }

    public void afterTextChanged(Editable object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        String string2 = DEFAULT_TEXT;
        if (bl2) {
            object = ChipTextInputComboView.access$200(this.this$0);
            String string3 = ChipTextInputComboView.access$100(this.this$0, string2);
            object.setText((CharSequence)string3);
            return;
        }
        object = ChipTextInputComboView.access$100(this.this$0, (CharSequence)object);
        Chip chip = ChipTextInputComboView.access$200(this.this$0);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) {
            object = ChipTextInputComboView.access$100(this.this$0, string2);
        }
        chip.setText((CharSequence)object);
    }
}

