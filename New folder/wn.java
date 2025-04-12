/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ClipData
 *  android.os.Build$VERSION
 *  android.text.Selection
 *  android.text.Spannable
 *  android.view.DragEvent
 *  android.view.View
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

public final class wn {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(DragEvent object, TextView textView, Activity object2) {
        object2.requestDragAndDropPermissions(object);
        float f5 = object.getX();
        float f6 = object.getY();
        int n3 = textView.getOffsetForPosition(f5, f6);
        textView.beginBatchEdit();
        try {
            CharSequence charSequence = textView.getText();
            charSequence = (Spannable)charSequence;
            Selection.setSelection((Spannable)charSequence, (int)n3);
            object = object.getClipData();
            n3 = Build.VERSION.SDK_INT;
            int n4 = 31;
            f6 = 4.3E-44f;
            int n7 = 3;
            if (n3 >= n4) {
                object2 = new M60$a((ClipData)object, n7);
            } else {
                object2 = new Object();
                ((M60$c)object2).a = object;
                ((M60$c)object2).b = n7;
            }
            object = object2.build();
            ViewCompat.o((View)textView, (M60)object);
            return true;
        }
        finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent object, View view, Activity object2) {
        object2.requestDragAndDropPermissions(object);
        object = object.getClipData();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        int n7 = 3;
        if (n3 >= n4) {
            object2 = new M60$a((ClipData)object, n7);
        } else {
            object2 = new Object();
            ((M60$c)object2).a = object;
            ((M60$c)object2).b = n7;
        }
        object = object2.build();
        ViewCompat.o(view, (M60)object);
        return true;
    }
}

