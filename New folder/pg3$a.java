/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R$id;

public final class pg3$a {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public pg3$a(View view) {
        TextView textView;
        this.a = textView = (TextView)view.findViewById(16908308);
        this.b = textView = (TextView)view.findViewById(16908309);
        textView = (ImageView)view.findViewById(16908295);
        this.c = textView;
        textView = (ImageView)view.findViewById(16908296);
        this.d = textView;
        int n3 = R$id.edit_query;
        view = (ImageView)view.findViewById(n3);
        this.e = view;
    }
}

