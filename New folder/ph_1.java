/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;

/*
 * Renamed from PH
 */
public final class ph_1
extends CTInboxBaseMessageViewHolder {
    public final RelativeLayout p;
    public final Button q;
    public final Button r;
    public final Button s;
    public final LinearLayout t;
    public final ImageView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public ph_1(View view) {
        super(view);
        TextView textView;
        view.setTag((Object)this);
        int n3 = R$id.messageTitle;
        this.v = textView = (TextView)view.findViewById(n3);
        n3 = R$id.messageText;
        this.w = textView = (TextView)view.findViewById(n3);
        n3 = R$id.media_image;
        textView = (ImageView)view.findViewById(n3);
        this.e = textView;
        n3 = R$id.image_icon;
        textView = (ImageView)view.findViewById(n3);
        this.u = textView;
        n3 = R$id.timestamp;
        this.x = textView = (TextView)view.findViewById(n3);
        n3 = R$id.cta_button_1;
        textView = (Button)view.findViewById(n3);
        this.q = textView;
        n3 = R$id.cta_button_2;
        textView = (Button)view.findViewById(n3);
        this.r = textView;
        n3 = R$id.cta_button_3;
        textView = (Button)view.findViewById(n3);
        this.s = textView;
        n3 = R$id.icon_message_frame_layout;
        textView = (FrameLayout)view.findViewById(n3);
        this.d = textView;
        n3 = R$id.square_media_image;
        textView = (ImageView)view.findViewById(n3);
        this.f = textView;
        n3 = R$id.click_relative_layout;
        textView = (RelativeLayout)view.findViewById(n3);
        this.p = textView;
        n3 = R$id.cta_linear_layout;
        textView = (LinearLayout)view.findViewById(n3);
        this.t = textView;
        n3 = R$id.icon_progress_frame_layout;
        textView = (FrameLayout)view.findViewById(n3);
        this.h = textView;
        n3 = R$id.media_layout;
        view = (RelativeLayout)view.findViewById(n3);
        this.g = view;
    }

    /*
     * Exception decompiling
     */
    public final void x(CTInboxMessage var1_1, CTInboxListViewFragment var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 34[TRYBLOCK] [45 : 817->821)] org.json.JSONException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

