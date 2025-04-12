/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.Spannable$Factory
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ClickableSpan
 *  android.util.AttributeSet
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView$1;
import com.ril.ajio.customviews.widgets.AjioTextView$SpanPosition;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AjioTextView
extends AppCompatTextView
implements CustomTextViewImpl {
    public AjioTextView(Context context) {
        super(context);
    }

    public AjioTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AjioTextView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void highlightTextInTextView(String object, Integer object2, int n3, ClickableSpan clickableSpan, boolean bl2, int n4) {
        ArrayList<AjioTextView$SpanPosition> arrayList = this.getText().toString();
        AjioTextView$1 ajioTextView$1 = new AjioTextView$1(this, clickableSpan, n3, bl2);
        AJIOApplication.Companion.getClass();
        clickableSpan = mz3_0.t(AJIOApplication$a.a(), n4);
        String string2 = "";
        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)clickableSpan);
        int n7 = 33;
        if (object != null && !(bl2 = ((String)object).isEmpty())) {
            string2 = Spannable.Factory.getInstance().newSpannable((CharSequence)((Object)arrayList));
            int n8 = 2;
            object = Pattern.compile((String)object, n8).matcher((CharSequence)((Object)arrayList));
            arrayList = new ArrayList<AjioTextView$SpanPosition>();
            while ((n8 = (int)(((Matcher)object).find() ? 1 : 0)) != 0) {
                int n10 = ((Matcher)object).start();
                int n14 = ((Matcher)object).end();
                AjioTextView$SpanPosition ajioTextView$SpanPosition = new AjioTextView$SpanPosition(n10, n14);
                arrayList.add(ajioTextView$SpanPosition);
            }
            if (object2 != null) {
                int n15 = (Integer)object2;
                if (n15 == 0) {
                    int n16;
                    n15 = (int)(arrayList.isEmpty() ? 1 : 0);
                    if (n15 != 0 || (n15 = ((Integer)object2).intValue()) > (n16 = arrayList.size() + -1)) return;
                    object = arrayList.iterator();
                    while ((n16 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        object2 = (AjioTextView$SpanPosition)object.next();
                        int n17 = ((AjioTextView$SpanPosition)object2).getStartPosition();
                        n8 = ((AjioTextView$SpanPosition)object2).getEndPosition();
                        string2.setSpan((Object)ajioTextView$1, n17, n8, n7);
                        if (n4 <= 0) continue;
                        n17 = ((AjioTextView$SpanPosition)object2).getStartPosition();
                        n16 = ((AjioTextView$SpanPosition)object2).getEndPosition();
                        string2.setSpan((Object)ajioCustomTypefaceSpan, n17, n16, n7);
                    }
                } else {
                    n15 = (Integer)object2;
                    if (n15 < 0) {
                        return;
                    }
                }
            }
        } else {
            object = Spannable.Factory.getInstance();
            string2 = object.newSpannable((CharSequence)((Object)arrayList));
            int n18 = ((String)((Object)arrayList)).length();
            boolean bl3 = false;
            object2 = null;
            string2.setSpan((Object)ajioTextView$1, 0, n18, n7);
            if (n4 > 0) {
                n18 = ((String)((Object)arrayList)).length();
                string2.setSpan((Object)ajioCustomTypefaceSpan, 0, n18, n7);
            }
        }
        if (string2 == null) return;
        this.setText(string2);
        object = LinkMovementMethod.getInstance();
        this.setMovementMethod((MovementMethod)object);
    }

    public void initField(Context context, AttributeSet attributeSet) {
    }

    public void removeUnderlineText() {
        int n3 = this.getPaintFlags() & 0xFFFFFFF7;
        this.setPaintFlags(n3);
    }

    public void setAlpha(float f5) {
        super.setAlpha(f5);
    }

    public void underlineText() {
        int n3 = this.getPaintFlags() | 8;
        this.setPaintFlags(n3);
    }
}

