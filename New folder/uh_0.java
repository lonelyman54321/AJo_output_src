/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.webkit.WebViewClient
 */
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;

/*
 * Renamed from UH
 */
public abstract class uh_0
extends sh_1
implements View.OnTouchListener,
View.OnLongClickListener {
    public final GestureDetector j;
    public fi_2 k;

    public uh_0() {
        GestureDetector gestureDetector;
        UH$a uH$a = new UH$a(this);
        this.j = gestureDetector = new GestureDetector((GestureDetector.OnGestureListener)uH$a);
    }

    public abstract ViewGroup Ua(View var1);

    public abstract View Va(LayoutInflater var1, ViewGroup var2);

    public final void Wa() {
        this.k.a();
        Object object = this.k.a;
        int n3 = object.y;
        int n4 = object.x;
        float f5 = this.getResources().getDisplayMetrics().density;
        n3 = (int)((float)n3 / f5);
        n4 = (int)((float)n4 / f5);
        String string2 = this.e.o;
        object = z41.a("<style>body{width:", "px; height: ", "px; margin: 0; padding:0;}</style>", n4, n3);
        String string3 = "<head>";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        String string4 = string2.replaceFirst(string3, (String)object);
        com.clevertap.android.sdk.b.j();
        object = this.k;
        n3 = (int)(f5 * 100.0f);
        object.setInitialScale(n3);
        this.k.loadDataWithBaseURL(null, string4, "text/html", "utf-8", null);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Wa();
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        block37: {
            block36: {
                object = this.Va((LayoutInflater)object, (ViewGroup)object2);
                object2 = this.Ua((View)object);
                Object object4 = this.c;
                Object object5 = this.e;
                int n3 = object5.K;
                int n4 = object5.l;
                int n7 = object5.L;
                int n8 = object5.m;
                object5 = object3;
                object3 = new fi_2((Context)object4, n3, n4, n7, n8);
                this.k = object3;
                object3 = new UH$b(this);
                object5 = this.k;
                object5.setWebViewClient((WebViewClient)object3);
                object3 = this.k;
                object3.setOnTouchListener((View.OnTouchListener)this);
                object3 = this.k;
                object3.setOnLongClickListener((View.OnLongClickListener)this);
                object3 = this.e;
                boolean bl2 = object3.u;
                if (!bl2) break block36;
                object3 = this.k;
                object3 = object3.getSettings();
                boolean bl3 = true;
                object3.setJavaScriptEnabled(bl3);
                object3 = this.k;
                object3 = object3.getSettings();
                bl3 = false;
                object5 = null;
                object3.setJavaScriptCanOpenWindowsAutomatically(false);
                object3 = this.k;
                object3 = object3.getSettings();
                object3.setAllowContentAccess(false);
                object3 = this.k;
                object3 = object3.getSettings();
                object3.setAllowFileAccess(false);
                object3 = this.k;
                object3 = object3.getSettings();
                object3.setAllowFileAccessFromFileURLs(false);
                object3 = this.k;
                object4 = this.getActivity();
                CleverTapInstanceConfig cleverTapInstanceConfig = this.b;
                object4 = com.clevertap.android.sdk.a.k(object4, cleverTapInstanceConfig);
                object5 = new li_1((a)object4, this);
                object4 = "CleverTap";
                object3.addJavascriptInterface(object5, (String)object4);
            }
            if (object2 == null) break block37;
            object3 = this.k;
            try {
                object2.addView((View)object3);
            }
            catch (Throwable throwable) {
                object = this.b.b();
                object2 = this.b.a;
                object.getClass();
                com.clevertap.android.sdk.b.m();
                object = null;
            }
        }
        return object;
    }

    public final boolean onLongClick(View view) {
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int n3;
        view = this.j;
        int n4 = view.onTouchEvent(motionEvent);
        if (n4 == 0 && (n4 = motionEvent.getAction()) != (n3 = 2)) {
            n4 = 0;
            view = null;
        } else {
            n4 = 1;
        }
        return n4 != 0;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Wa();
    }
}

