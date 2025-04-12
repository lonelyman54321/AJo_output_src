/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Spannable$Factory
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ClickableSpan
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.ril.ajio.customviews.widgets.AjioCheckBox$1;
import com.ril.ajio.customviews.widgets.AjioCheckBox$SpanPosition;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AjioCheckBox
extends AppCompatCheckBox
implements CustomTextViewImpl {
    public AjioCheckBox(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioCheckBox(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void highlightTextInTextView(String iterator, Integer object, int n3, ClickableSpan clickableSpan, boolean bl2) {
        boolean bl3;
        Object object2 = this.getText().toString();
        AjioCheckBox$1 ajioCheckBox$1 = new AjioCheckBox$1(this, clickableSpan, n3, bl2);
        n3 = 33;
        if (iterator != null && !(bl3 = ((String)((Object)iterator)).isEmpty())) {
            boolean bl4;
            clickableSpan = Spannable.Factory.getInstance().newSpannable((CharSequence)object2);
            int n4 = 2;
            iterator = Pattern.compile(iterator, n4).matcher((CharSequence)object2);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            while (bl4 = ((Matcher)((Object)iterator)).find()) {
                int n7 = ((Matcher)((Object)iterator)).start();
                int n8 = ((Matcher)((Object)iterator)).end();
                object2 = new AjioCheckBox$SpanPosition(this, n7, n8);
                arrayList.add(object2);
            }
            if (object != null) {
                int n10 = (Integer)object;
                if (n10 == 0) {
                    int n14;
                    n10 = (int)(arrayList.isEmpty() ? 1 : 0);
                    if (n10 != 0 || (n10 = ((Integer)object).intValue()) > (n14 = arrayList.size() + -1)) return;
                    iterator = arrayList.iterator();
                    while ((n14 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object = (AjioCheckBox$SpanPosition)iterator.next();
                        int n15 = ((AjioCheckBox$SpanPosition)object).getStartPosition();
                        n14 = ((AjioCheckBox$SpanPosition)object).getEndPosition();
                        clickableSpan.setSpan((Object)ajioCheckBox$1, n15, n14, n3);
                    }
                } else {
                    n10 = (Integer)object;
                    if (n10 < 0) {
                        return;
                    }
                }
            }
        } else {
            clickableSpan = Spannable.Factory.getInstance().newSpannable((CharSequence)object2);
            boolean bl5 = false;
            iterator = null;
            int n16 = ((String)object2).length();
            clickableSpan.setSpan((Object)ajioCheckBox$1, 0, n16, n3);
        }
        if (clickableSpan == null) return;
        this.setText((CharSequence)clickableSpan);
        iterator = LinkMovementMethod.getInstance();
        this.setMovementMethod((MovementMethod)iterator);
    }

    public void initField(Context context, AttributeSet attributeSet) {
    }
}

