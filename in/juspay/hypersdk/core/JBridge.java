/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.content.BroadcastReceiver
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ResolveInfo$DisplayNameComparator
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  android.view.animation.RotateAnimation
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.DatePicker
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.b;
import in.juspay.hyper.bridge.ThreeDS2Bridge;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R$drawable;
import in.juspay.hypersdk.core.CustomtabActivity;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.JBridge$1;
import in.juspay.hypersdk.core.JBridge$2;
import in.juspay.hypersdk.core.JsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.mystique.SwypeLayout;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.security.HyperSSLSocketFactory;
import in.juspay.hypersdk.security.JOSEUtils;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.NetUtils;
import in.juspay.hypersdk.utils.network.SessionizedNetUtils;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JBridge
extends DuiInterface {
    private static final String LOG_TAG = "JBridge";
    private final int JUSPAY_LOADER_ID;
    private final Set acceptedCerts;
    private final AtomicInteger apiTag;
    private BroadcastReceiver broadcastReceiver = null;
    private NetUtils netUtils;
    private NetUtils netUtilsSsl;

    public JBridge(JuspayServices juspayServices) {
        super(juspayServices);
        this.JUSPAY_LOADER_ID = 898989;
        SdkTracker sdkTracker = null;
        Object object = new AtomicInteger(0);
        this.apiTag = object;
        super();
        this.acceptedCerts = object;
        Object object2 = this.sessionInfo;
        object = new SessionizedNetUtils((SessionInfo)object2, 0, 0, false);
        this.netUtils = object;
        object2 = this.sessionInfo;
        boolean bl2 = true;
        object = new SessionizedNetUtils((SessionInfo)object2, 0, 0, bl2);
        try {
            this.netUtilsSsl = object;
        }
        catch (Exception exception) {
            sdkTracker = juspayServices.getSdkTracker();
            String string2 = "jbridge";
            String string3 = "Error while instantiating NetUtils";
            object2 = LOG_TAG;
            String string4 = "action";
            String string5 = "system";
            sdkTracker.trackAndLogException((String)object2, string4, string5, string2, string3, exception);
        }
    }

    public static /* synthetic */ void access$000(JBridge jBridge, Intent intent) {
        jBridge.receiverCallback(intent);
    }

    public static float dpToPx(float f5, Context context) {
        return (float)context.getResources().getDisplayMetrics().densityDpi / 160.0f * f5;
    }

    private void drawIcon(Drawable drawable2, int n3) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        fk1_1 fk1_12 = new fk1_1(this, n3, drawable2, sdkTracker);
        ExecutorManager.runOnMainThread(fk1_12);
    }

    private static SecretKey generateAESKey() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    private Map getDecodedQueryParameters(String stringArray) {
        int n3;
        HashMap<String, String> hashMap;
        int n4;
        if (stringArray != null && (n4 = ((String)((Object)(hashMap = stringArray.trim()))).length()) >= (n3 = 1)) {
            hashMap = new HashMap<String, String>();
            String string2 = "&";
            for (String string3 : stringArray.split(string2)) {
                String string4 = "=";
                int n7 = string3.indexOf(string4);
                String string5 = string3.substring(0, n7);
                String string6 = "UTF-8";
                string5 = URLDecoder.decode(string5, string6).trim();
                string3 = URLDecoder.decode(string3.substring(n7 += n3), string6).trim();
                hashMap.put(string5, string3);
            }
            return hashMap;
        }
        return null;
    }

    private PrivateKey getPrivateKey(String object) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        object = keyStore.getEntry((String)object, null);
        boolean bl2 = object instanceof KeyStore.PrivateKeyEntry;
        if (bl2) {
            return ((KeyStore.PrivateKeyEntry)object).getPrivateKey();
        }
        return null;
    }

    private PublicKey getPublicKey(String object) {
        block7: {
            Object object2 = "AndroidKeyStore";
            object2 = KeyStore.getInstance((String)object2);
            ((KeyStore)object2).load(null);
            object = ((KeyStore)object2).getEntry((String)object, null);
            boolean bl2 = object instanceof KeyStore.PrivateKeyEntry;
            if (!bl2) break block7;
            object = (KeyStore.PrivateKeyEntry)object;
            object = ((KeyStore.PrivateKeyEntry)object).getCertificate();
            try {
                return ((Certificate)object).getPublicKey();
            }
            catch (Exception exception) {
                object = this.juspayServices;
                object2 = ((JuspayServices)object).getSdkTracker();
                String string2 = "jbridge";
                String string3 = "Error in getPublicKey";
                String string4 = LOG_TAG;
                String string5 = "action";
                String string6 = "system";
                ((SdkTracker)object2).trackAndLogException(string4, string5, string6, string2, string3, exception);
            }
        }
        return null;
    }

    public static String hmacDigest(String object, String object2, String object3) {
        Object object4 = StandardCharsets.UTF_8;
        object2 = ((String)object2).getBytes((Charset)object4);
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object2, (String)object3);
        object2 = Mac.getInstance((String)object3);
        ((Mac)object2).init(secretKeySpec);
        object3 = StandardCharsets.US_ASCII;
        object = ((String)object).getBytes((Charset)object3);
        object = ((Mac)object2).doFinal((byte[])object);
        object2 = new StringBuilder();
        int n3 = ((Object)object).length;
        secretKeySpec = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            block17: {
                int n4 = object[i3] & 0xFF;
                object4 = Integer.toHexString(n4);
                char c2 = ((String)object4).length();
                char c3 = '\u0001';
                if (c2 != c3) break block17;
                c2 = '0';
                ((StringBuilder)object2).append(c2);
            }
            ((StringBuilder)object2).append((String)object4);
            continue;
        }
        try {
            object = ((StringBuilder)object2).toString();
        }
        catch (Exception exception) {
            object = null;
        }
        return object;
    }

    private /* synthetic */ void lambda$drawIcon$2(int n3, Drawable object, SdkTracker sdkTracker) {
        Object object2 = this.activity;
        if (object2 == null) {
            return;
        }
        object2 = object2.findViewById(n3);
        Object object3 = this.activity;
        Object object4 = new ImageView((Context)object3);
        object4.setImageDrawable(object);
        if (object2 != null) {
            object2 = (ViewGroup)object2;
            object2.addView((View)object4);
        } else {
            object = "No view at ";
            object2 = " found to attach the image.";
            String string2 = Gj0.b(n3, (String)object, (String)object2);
            String string3 = "jbridge";
            String string4 = "draw_icon";
            object3 = "system";
            String string5 = "error";
            object4 = sdkTracker;
            sdkTracker.trackAction((String)object3, string5, string3, string4, string2);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$hideJuspayLoader$1(String string2) {
        float f5;
        int n3;
        String string3;
        float f6;
        Activity activity;
        block7: {
            activity = this.activity;
            if (activity == null) {
                return;
            }
            int n4 = 898989;
            f6 = 1.259752E-39f;
            if ((activity = activity.findViewById(n4)) == null) {
                return;
            }
            n4 = 1065353216;
            f6 = 1.0f;
            Object object = new JSONObject(string2);
            string2 = "animationDuration";
            string3 = "1000";
            string2 = object.optString(string2, string3);
            n3 = Integer.parseInt(string2);
            string3 = "startAlpha";
            String string4 = "1.0";
            string3 = object.optString(string3, string4);
            f6 = Float.parseFloat(string3);
            string3 = "endAlpha";
            string4 = "0.0";
            object = object.optString(string3, string4);
            f5 = Float.parseFloat((String)object);
            break block7;
            {
                catch (Exception exception) {}
            }
            catch (Exception exception) {
                n3 = 1000;
                f5 = 0.0f;
                object = null;
            }
        }
        string3 = new AlphaAnimation(f6, f5);
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        string3.setInterpolator((Interpolator)accelerateInterpolator);
        long l2 = n3;
        string3.setDuration(l2);
        activity.setAnimation((Animation)string3);
        string2 = this.juspayServices.getContainer();
        if (string2 != null) {
            string2.removeView((View)activity);
        }
    }

    private /* synthetic */ void lambda$newDialogWithoutDateField$3(String string2, DatePicker object, int n3, int n4, int n7) {
        int n8 = n7 / 10;
        String string3 = "";
        String string4 = "0";
        object = n8 == 0 ? hj0_0.a(n7, string4) : hj0_0.a(n7, string3);
        n7 = ++n4 / 10;
        String string5 = n7 == 0 ? hj0_0.a(n4, string4) : hj0_0.a(n4, string3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        String string6 = "-";
        stringBuilder.append(string6);
        stringBuilder.append(string5);
        stringBuilder.append(string6);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        this.invokeCallbackInDUIWebview(string2, (String)object);
    }

    private /* synthetic */ void lambda$newDialogWithoutDateField$4(String string2, DialogInterface dialogInterface) {
        this.invokeCallbackInDUIWebview(string2, "NaN-NaN");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$showJuspayLoader$0(String string2) {
        String string3;
        int n3;
        Object object;
        JSONObject jSONObject;
        String string4;
        float f5;
        float f6;
        int n4;
        int n7;
        String string5;
        JBridge jBridge;
        block7: {
            jBridge = this;
            string5 = "Processing your payment";
            Activity activity = this.activity;
            if (activity == null) {
                return;
            }
            n7 = 898989;
            if ((activity = activity.findViewById(n7)) != null) {
                return;
            }
            n4 = 1000;
            f6 = 0.0f;
            f5 = 1.0f;
            try {
                string4 = string2;
                jSONObject = new JSONObject(string2);
                string4 = "rotationDuration";
                object = "2100";
                string4 = jSONObject.optString(string4, (String)object);
                n3 = Integer.parseInt(string4);
                object = "animationDuration";
                string3 = "1000";
            }
            catch (Exception exception) {
                n3 = 2100;
                break block7;
            }
            try {
                object = jSONObject.optString((String)object, string3);
                n4 = Integer.parseInt((String)object);
                object = "startAlpha";
                string3 = "0.0";
                object = jSONObject.optString((String)object, string3);
                f6 = Float.parseFloat((String)object);
                object = "endAlpha";
                string3 = "1.0";
                object = jSONObject.optString((String)object, string3);
                f5 = Float.parseFloat((String)object);
                object = "message";
                string5 = jSONObject.optString((String)object, string5);
            }
            catch (Exception exception) {}
        }
        object = jBridge.activity;
        jSONObject = new LinearLayout((Context)object);
        int n8 = -1;
        object = new LinearLayout.LayoutParams(n8, n8);
        jSONObject.setLayoutParams((ViewGroup.LayoutParams)object);
        int n10 = Color.parseColor((String)"#ffffff");
        jSONObject.setBackgroundColor(n10);
        n10 = 17;
        jSONObject.setGravity(n10);
        jSONObject.setId(n7);
        n7 = 1;
        jSONObject.setClickable(n7 != 0);
        Activity activity = jBridge.activity;
        object = new LinearLayout((Context)activity);
        int n14 = -2;
        activity = new LinearLayout.LayoutParams(n14, n14);
        object.setLayoutParams((ViewGroup.LayoutParams)activity);
        object.setOrientation(n7);
        object.setGravity(n7);
        activity = jBridge.activity;
        ImageView imageView = new ImageView((Context)activity);
        int n15 = R$drawable.juspay_icon;
        imageView.setBackgroundResource(n15);
        Activity activity2 = jBridge.activity;
        float f7 = 48.0f;
        int n16 = (int)JBridge.dpToPx(f7, (Context)activity2);
        Activity activity3 = jBridge.activity;
        int n17 = (int)JBridge.dpToPx(f7, (Context)activity3);
        activity = new LinearLayout.LayoutParams(n16, n17);
        imageView.setLayoutParams((ViewGroup.LayoutParams)activity);
        int n18 = 1;
        float f8 = 0.5f;
        float f11 = 350.0f;
        int n19 = 1;
        float f12 = 0.5f;
        activity3 = activity;
        activity = new RotateAnimation(0.0f, f11, n19, f12, n18, f8);
        activity2 = new LinearInterpolator();
        activity.setInterpolator((Interpolator)activity2);
        activity.setRepeatCount(n8);
        long l2 = n3;
        activity.setDuration(l2);
        imageView.startAnimation((Animation)activity);
        string3 = jBridge.activity;
        string4 = new TextView((Context)string3);
        string3 = new LinearLayout.LayoutParams(n14, n14);
        string4.setLayoutParams((ViewGroup.LayoutParams)string3);
        string3 = jBridge.activity;
        n8 = (int)JBridge.dpToPx(10.0f, (Context)string3);
        activity = jBridge.activity;
        n15 = (int)JBridge.dpToPx(20.0f, (Context)activity);
        n14 = 0;
        string4.setPadding(0, n8, 0, n15);
        float f14 = 16.0f;
        string4.setTextSize(f14);
        n8 = Color.parseColor((String)"#000000");
        string4.setTextColor(n8);
        string4.setText((CharSequence)string5);
        string3 = jBridge.activity;
        string5 = new ImageView((Context)string3);
        n8 = R$drawable.juspay_safe;
        string5.setBackgroundResource(n8);
        activity = jBridge.activity;
        n15 = (int)JBridge.dpToPx(90.0f, (Context)activity);
        activity2 = jBridge.activity;
        n17 = 0x41400000;
        f7 = 12.0f;
        n16 = (int)JBridge.dpToPx(f7, (Context)activity2);
        string3 = new LinearLayout.LayoutParams(n15, n16);
        string5.setLayoutParams((ViewGroup.LayoutParams)string3);
        string3 = (LinearLayout.LayoutParams)string5.getLayoutParams();
        activity = jBridge.activity;
        n16 = 1103101952;
        float f15 = 24.0f;
        float f16 = JBridge.dpToPx(f15, (Context)activity);
        n15 = (int)f16;
        string3.setMargins(0, n15, 0, 0);
        object.addView((View)imageView);
        object.addView((View)string5);
        object.addView((View)string4);
        jSONObject.addView((View)object);
        string5 = new AlphaAnimation(f6, f5);
        imageView = new DecelerateInterpolator();
        string5.setInterpolator((Interpolator)imageView);
        long l3 = n4;
        string5.setDuration(l3);
        jSONObject.setAnimation((Animation)string5);
        string5 = jBridge.juspayServices.getContainer();
        if (string5 != null) {
            string5.addView((View)jSONObject);
        }
    }

    private /* synthetic */ void lambda$startDatePicker$5(String string2, String string3, int n3, String string4, String string5, boolean bl2) {
        String string6;
        boolean bl3;
        Resources resources;
        if ((string2 = this.newDialogWithoutDateField(string2, string3, n3)) == null) {
            return;
        }
        string3 = "undefined";
        if (string4 != null && (n3 = (int)(string4.isEmpty() ? 1 : 0)) == 0 && (n3 = (int)(string4.equals(string3) ? 1 : 0)) == 0) {
            resources = string2.getDatePicker();
            long l2 = this.dateToMillisecond(string4);
            resources.setMinDate(l2);
        }
        if (string5 != null && (n3 = (int)(string5.isEmpty() ? 1 : 0)) == 0 && !(bl3 = string5.equals(string3))) {
            string3 = string2.getDatePicker();
            long l3 = this.dateToMillisecond(string5);
            string3.setMaxDate(l3);
        }
        string3 = string2.getDatePicker();
        resources = Resources.getSystem();
        n3 = resources.getIdentifier(string6 = "day", string4 = "id", string5 = "android");
        if ((string3 = string3.findViewById(n3)) != null) {
            if (bl2) {
                n3 = 0;
                resources = null;
                string3.setVisibility(0);
            } else {
                n3 = 8;
                string3.setVisibility(n3);
            }
        }
        string2.show();
    }

    private void lambda$startLottieAnimation$6(int n3, String string2, boolean bl2, float f5, float f6, SdkTracker sdkTracker) {
        int n4;
        Object object;
        Object object2;
        Object object3;
        block12: {
            block11: {
                object3 = this.activity;
                if (object3 != null) break block11;
                return;
            }
            object2 = object3.findViewById(n3);
            object2 = (LottieAnimationView)((Object)object2);
            object3 = ((LottieAnimationView)((Object)object2)).e;
            object = AC1.MergePathsApi19;
            boolean bl3 = true;
            ((yc1_1)((Object)object3)).h((AC1)((Object)object), bl3);
            ((LottieAnimationView)((Object)object2)).setAnimation(string2);
            if (bl2) {
                n4 = -1;
                break block12;
            }
            n4 = 0;
            string2 = null;
        }
        ((LottieAnimationView)((Object)object2)).setRepeatCount(n4);
        try {
            ((LottieAnimationView)((Object)object2)).setMinAndMaxProgress(f5, f6);
            ((LottieAnimationView)((Object)object2)).f();
        }
        catch (Exception exception) {
            String string3 = "action";
            String string4 = "system";
            object = LOG_TAG;
            String string5 = "jbridge";
            String string6 = "Exception while playing Lottie animation";
            object3 = sdkTracker;
            sdkTracker.trackAndLogException((String)object, string3, string4, string5, string6, exception);
        }
    }

    private PublicKey loadPublicKey(String object) {
        object = Base64.decode((String)object, (int)2);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object);
        return KeyFactory.getInstance("RSA").generatePublic(x509EncodedKeySpec);
    }

    public static /* synthetic */ void n(JBridge jBridge, int n3, String string2, boolean bl2, float f5, float f6, SdkTracker sdkTracker) {
        jBridge.lambda$startLottieAnimation$6(n3, string2, bl2, f5, f6, sdkTracker);
    }

    private DatePickerDialog newDialogWithoutDateField(String string2, String string3, int n3) {
        boolean bl2;
        Calendar calendar = Calendar.getInstance();
        kk1_2 kk1_22 = new kk1_2(this, string2);
        lk1_2 lk1_22 = new lk1_2(this, string2);
        if (string3 != null && !(bl2 = string3.isEmpty()) && !(bl2 = string3.equals(string2 = "undefined"))) {
            long l2 = this.dateToMillisecond(string3);
            calendar.setTimeInMillis(l2);
        }
        if ((string2 = this.activity) != null) {
            Activity activity = this.activity;
            int n4 = calendar.get(1);
            int n7 = calendar.get(2);
            int n8 = 5;
            int n10 = calendar.get(n8);
            string2 = new DatePickerDialog((Context)activity, n3, (DatePickerDialog.OnDateSetListener)kk1_22, n4, n7, n10);
            string2.setOnCancelListener((DialogInterface.OnCancelListener)lk1_22);
        } else {
            bl2 = false;
            string2 = null;
        }
        return string2;
    }

    public static /* synthetic */ void o(JBridge jBridge, String string2, String string3, int n3, String string4, String string5, boolean bl2) {
        jBridge.lambda$startDatePicker$5(string2, string3, n3, string4, string5, bl2);
    }

    public static /* synthetic */ void p(JBridge jBridge, int n3, Drawable drawable2, SdkTracker sdkTracker) {
        jBridge.lambda$drawIcon$2(n3, drawable2, sdkTracker);
    }

    public static /* synthetic */ void q(JBridge jBridge, String string2, DatePicker datePicker, int n3, int n4, int n7) {
        jBridge.lambda$newDialogWithoutDateField$3(string2, datePicker, n3, n4, n7);
    }

    public static /* synthetic */ void r(JBridge jBridge, String string2, DialogInterface dialogInterface) {
        jBridge.lambda$newDialogWithoutDateField$4(string2, dialogInterface);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void receiverCallback(Intent object) {
        Exception exception;
        SdkTracker sdkTracker;
        block4: {
            String string2;
            Object object2;
            sdkTracker = this.juspayServices.getSdkTracker();
            try {
                object2 = object.getAction();
                if (object2 == null) {
                    object2 = "action is null";
                    object = new Exception((String)object2);
                    throw object;
                }
                string2 = "customtab-result";
                boolean bl2 = ((String)object2).equals(string2);
                if (bl2) {
                    this.handleCustomTabResult((Intent)object);
                    return;
                }
            }
            catch (Exception exception2) {
                exception = exception2;
                break block4;
            }
            string2 = "external_sdk";
            String string3 = "error";
            String string4 = "receiver_callback";
            String string5 = "unknown_intent";
            Object var10_16 = null;
            Object var11_18 = null;
            Object var6_10 = null;
            object2 = sdkTracker;
            sdkTracker.trackApiCalls(string2, string3, string4, null, null, null, null, null, string5, null);
            return;
        }
        String string6 = "receiver_callback";
        String string7 = "JSON Exception";
        String string8 = LOG_TAG;
        String string9 = "api_call";
        String string10 = "external_sdk";
        SdkTracker sdkTracker2 = sdkTracker;
        sdkTracker.trackAndLogException(string8, string9, string10, string6, string7, exception);
    }

    public static /* synthetic */ void s(JBridge jBridge, String string2) {
        jBridge.lambda$showJuspayLoader$0(string2);
    }

    public static /* synthetic */ void t(JBridge jBridge, String string2) {
        jBridge.lambda$hideJuspayLoader$1(string2);
    }

    private int versionCompare(String object, String object2) {
        int n3 = TextUtils.isEmpty((CharSequence)object);
        if (n3 == 0 && (n3 = TextUtils.isEmpty((CharSequence)object2)) == 0) {
            String string2;
            String string3;
            int n4;
            String string4 = "\\.";
            object = ((String)object).split(string4);
            object2 = object2.split(string4);
            string4 = null;
            for (n3 = 0; n3 < (n4 = ((String[])object).length) && n3 < (n4 = ((String[])object2).length) && (n4 = (int)((string3 = object[n3]).equalsIgnoreCase(string2 = object2[n3]) ? 1 : 0)) != 0; ++n3) {
            }
            n4 = ((String[])object).length;
            if (n3 < n4 && n3 < (n4 = ((String[])object2).length)) {
                object = Integer.valueOf(object[n3]);
                object2 = Integer.valueOf(object2[n3]);
                return Integer.signum(((Integer)object).compareTo((Integer)object2));
            }
            int n7 = ((String[])object).length;
            int n8 = ((String[])object2).length;
            return Integer.signum(n7 - n8);
        }
        return 1;
    }

    public void addCertificates(String string2) {
        String string3;
        Object object;
        int n3;
        JuspayServices juspayServices = this.juspayServices;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            juspayServices = new JSONArray(string2);
            n3 = 0;
            string2 = null;
        }
        catch (Exception exception) {
            String string4 = "jbridge";
            String string5 = "Exception while manipulating JSON";
            object = LOG_TAG;
            string3 = "action";
            String string6 = "system";
            sdkTracker.trackAndLogException((String)object, string3, string6, string4, string5, exception);
        }
        while (true) {
            int n4 = juspayServices.length();
            if (n3 >= n4) break;
            object = this.acceptedCerts;
            string3 = juspayServices.getString(n3);
            object.add(string3);
            ++n3;
            continue;
            break;
        }
    }

    public void amazonNonTokenPay(String string2, String string3) {
        this.launchCustomTab(string2, string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void attachBase64ImageToId(String object, String string2) {
        Activity activity;
        try {
            activity = this.activity;
        }
        catch (Exception exception) {
            return;
        }
        int n3 = Integer.parseInt(string2);
        string2 = activity.findViewById(n3);
        string2 = (ImageView)string2;
        activity = null;
        object = Base64.decode((String)object, (int)0);
        int n4 = ((Object)object).length;
        object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n4);
        string2.setImageBitmap((Bitmap)object);
    }

    public void blurBackground(String string2, String string3, int n3) {
    }

    public String callAPI(String string2, String string3, String string4, String string5, boolean bl2, boolean bl3, String string6) {
        JSONObject jSONObject = new JSONObject();
        String string7 = jSONObject.toString();
        return this.callAPIWithOptions(string2, string3, string4, string5, bl2, bl3, string7, string6);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String callAPIWithOptions(String string2, String string3, String string4, String string5, boolean bl2, boolean bl3, String string6, String string7) {
        Object object;
        Object object2;
        Object object3;
        String string8;
        Object object4;
        Object object5;
        Long l2;
        JSONObject jSONObject;
        Object[] objectArray;
        JSONArray jSONArray;
        Object object6;
        String string9;
        long l3;
        JuspayServices juspayServices;
        Object object7;
        DynamicUI dynamicUI;
        Object object8;
        SdkTracker sdkTracker;
        String string10;
        Object object9;
        block13: {
            block12: {
                Object object10;
                String string11;
                String string12;
                String string13;
                block11: {
                    block10: {
                        object9 = this;
                        string10 = string7;
                        sdkTracker = this.juspayServices.getSdkTracker();
                        object8 = this.juspayServices;
                        dynamicUI = ((JuspayServices)object8).getDynamicUI();
                        try {
                            object7 = string6;
                            object8 = new JSONObject(string6);
                        }
                        catch (Exception exception) {
                            object8 = new JSONObject();
                        }
                        juspayServices = object8;
                        l3 = System.currentTimeMillis();
                        object8 = new StringBuilder("tag");
                        int n3 = ((JBridge)object9).apiTag.incrementAndGet();
                        ((StringBuilder)object8).append(n3);
                        string9 = ((StringBuilder)object8).toString();
                        object6 = JSONObject.NULL;
                        object7 = "channels";
                        jSONArray = juspayServices.optJSONArray((String)object7);
                        objectArray = "rootLogFields";
                        jSONObject = juspayServices.optJSONObject((String)objectArray);
                        l2 = null;
                        string13 = "network";
                        string12 = "info";
                        string11 = "before_request";
                        object5 = null;
                        object4 = sdkTracker;
                        string8 = string3;
                        object10 = string9;
                        sdkTracker.trackApiCalls(string13, string12, string11, null, string3, string9, l3, null, object6, null, string2, jSONArray, jSONObject);
                        object8 = bl3 ? ((JBridge)object9).netUtilsSsl : ((JBridge)object9).netUtils;
                        object3 = object8;
                        if (object8 != null) break block12;
                        if (bl3) {
                            try {
                                object2 = ((DuiInterface)object9).sessionInfo;
                                boolean bl4 = true;
                                ((JBridge)object9).netUtilsSsl = object8 = new SessionizedNetUtils((SessionInfo)object2, 0, 0, bl4);
                                break block10;
                            }
                            catch (Exception exception) {
                                object10 = exception;
                                break block11;
                            }
                        }
                        object2 = ((DuiInterface)object9).sessionInfo;
                        ((JBridge)object9).netUtils = object8 = new SessionizedNetUtils((SessionInfo)object2, 0, 0, false);
                    }
                    object = object8;
                    break block13;
                }
                object8 = ((JsInterface)object9).juspayServices;
                object4 = ((JuspayServices)object8).getSdkTracker();
                object5 = "jbridge";
                string8 = "Error while instantiating NetUtils in callAPI";
                string13 = LOG_TAG;
                string12 = "action";
                string11 = "system";
                ((SdkTracker)object4).trackAndLogException(string13, string12, string11, (String)object5, string8, (Throwable)object10);
            }
            object = object3;
        }
        if (object == null) {
            if (string10 != null) {
                object8 = "{}".getBytes();
                int n4 = 2;
                object8 = Base64.encodeToString((byte[])object8, (int)n4);
                object3 = Base64.encodeToString((byte[])string3.getBytes(), (int)n4);
                String string14 = "','failure','";
                String string15 = "','-1','";
                object8 = og_1.a("window.callUICallback('", string10, string14, (String)object8, string15);
                object2 = "','%7B%7D');";
                object8 = h30_0.a((StringBuilder)object8, (String)object3, (String)object2);
                dynamicUI.addJsToWebView((String)object8);
            }
            object5 = -1;
            l2 = System.currentTimeMillis();
            jSONArray = juspayServices.optJSONArray((String)object7);
            jSONObject = juspayServices.optJSONObject((String)objectArray);
            object4 = sdkTracker;
            string8 = string3;
            object6 = string4;
            sdkTracker.trackApiCalls("network", "error", "network_call", (Integer)object5, string3, null, l3, l2, string4, "Unable to create netUtils object", string2, jSONArray, jSONObject);
            return "";
        }
        if (bl3) {
            try {
                object7 = ((JBridge)object9).acceptedCerts;
                object8 = new HyperSSLSocketFactory((Set)object7);
                object8 = ((HyperSSLSocketFactory)object8).getSslSocketFactory();
                ((NetUtils)object).setSslSocketFactory((SSLSocketFactory)object8);
            }
            catch (Exception exception) {
                object7 = LOG_TAG;
                objectArray = "Exception: ";
                JuspayLogger.e(object7, (String)objectArray, exception);
            }
        }
        object7 = object8;
        objectArray = this;
        object3 = string3;
        object2 = string9;
        String string16 = string4;
        String string17 = string2;
        string10 = string7;
        object4 = object;
        object = string5;
        object9 = object4;
        object8 = new JBridge$2(this, sdkTracker, string3, string9, l3, string4, string2, (JSONObject)juspayServices, string7, dynamicUI, string5, bl2, (NetUtils)object4);
        object7 = AsyncTask.THREAD_POOL_EXECUTOR;
        objectArray = new Object[]{};
        object8.executeOnExecutor((Executor)object7, objectArray);
        return string9;
    }

    public void cancelAPI(String string2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        NetUtils.cancelAPICall(string2, sdkTracker);
    }

    public void checkAmazonNonTokenSdk(String string2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        String string3 = "true";
        try {
            this.invokeCallbackInDUIWebview(string2, string3);
        }
        catch (ClassNotFoundException classNotFoundException) {
            String string4 = "amazon_utils";
            String string5 = "Amazon Sdk Not found Exception";
            String string6 = LOG_TAG;
            String string7 = "api_call";
            String string8 = "external_sdk";
            sdkTracker.trackAndLogException(string6, string7, string8, string4, string5, classNotFoundException);
            String string9 = "false";
            this.invokeCallbackInDUIWebview(string2, string9);
        }
    }

    public boolean checkCustomTabs() {
        return true;
    }

    public void checkPhonePeSdk(String string2) {
        String string3 = String.valueOf(this.checkPhonePeSdk());
        this.invokeCallbackInDUIWebview(string2, string3);
    }

    public boolean checkPhonePeSdk() {
        String string2 = "com.phonepe.android.sdk.api.PhonePe";
        try {
            Class.forName(string2);
            string2 = "com.phonepe.android.sdk.api.PhonePeInitException";
        }
        catch (Exception exception) {
            return false;
        }
        Class.forName(string2);
        string2 = "com.phonepe.android.sdk.api.builders.TransactionRequestBuilder";
        Class.forName(string2);
        string2 = "com.phonepe.android.sdk.base.model.TransactionRequest";
        Class.forName(string2);
        return true;
    }

    public void copyLink(String string2, String string3, String string4) {
        ClipboardManager clipboardManager = (ClipboardManager)this.juspayServices.getContext().getSystemService("clipboard");
        string2 = ClipData.newPlainText((CharSequence)string3, (CharSequence)string2);
        clipboardManager.setPrimaryClip((ClipData)string2);
        this.invokeCallbackInDUIWebview(string4, "true");
    }

    public int cursorPosition(int n3) {
        block5: {
            JuspayServices juspayServices = this.juspayServices;
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            juspayServices = this.activity;
            if (juspayServices == null) break block5;
            View view = juspayServices.findViewById(n3);
            view = (EditText)view;
            if (view == null) break block5;
            try {
                return view.getSelectionStart();
            }
            catch (Exception exception) {
                String string2 = "jbridge";
                String string3 = "Cursor Position Exception";
                String string4 = LOG_TAG;
                String string5 = "action";
                String string6 = "system";
                sdkTracker.trackAndLogException(string4, string5, string6, string2, string3, exception);
            }
        }
        return 0;
    }

    public long dateToMillisecond(String object) {
        block3: {
            SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
            Object object2 = Locale.getDefault();
            String string2 = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, (Locale)object2);
            object = simpleDateFormat.parse((String)object);
            if (object == null) break block3;
            try {
                return ((Date)object).getTime();
            }
            catch (ParseException parseException) {
                String string3 = "jbridge";
                String string4 = "Error in date to millis";
                object2 = LOG_TAG;
                string2 = "action";
                String string5 = "system";
                sdkTracker.trackAndLogException((String)object2, string2, string5, string3, string4, parseException);
            }
        }
        return 0L;
    }

    public String decryptJWE(String object, String object2, String object3, String object4, String object5, String object6) {
        Object object7;
        Object object8 = "{\"error\":false,\"payload\":\"";
        int n3 = 2;
        try {
            object = Base64.decode((String)object, (int)n3);
        }
        catch (Exception exception) {
            object8 = this.juspayServices.getSdkTracker();
            object7 = exception;
            ((SdkTracker)object8).trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Error in JWE Decryption", exception);
            object2 = new Object[]{exception};
            return String.format("{\"error\":true,\"payload\":\"%s\"}", object2);
        }
        object2 = Base64.decode((String)object2, (int)n3);
        object3 = Base64.decode((String)object3, (int)n3);
        object4 = Base64.decode((String)object4, (int)n3);
        object5 = Base64.decode((String)object5, (int)n3);
        Object object9 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
        object9 = Cipher.getInstance((String)object9);
        String string2 = "SHA-256";
        String string3 = "MGF1";
        Object object10 = "SHA-1";
        object7 = new MGF1ParameterSpec((String)object10);
        object10 = PSource.PSpecified.DEFAULT;
        OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec(string2, string3, (AlgorithmParameterSpec)object7, (PSource)object10);
        object6 = this.getPrivateKey((String)object6);
        ((Cipher)object9).init(n3, (Key)object6, oAEPParameterSpec);
        object2 = ((Cipher)object9).doFinal((byte[])object2);
        int n4 = ((Object)object4).length;
        int n7 = ((Object)object5).length;
        n4 += n7;
        object6 = new byte[n4];
        n7 = ((Object)object4).length;
        System.arraycopy(object4, 0, object6, 0, n7);
        int n8 = ((Object)object4).length;
        n7 = ((Object)object5).length;
        System.arraycopy(object5, 0, object6, n8, n7);
        object4 = "AES/GCM/NoPadding";
        object4 = Cipher.getInstance((String)object4);
        n7 = 128;
        object5 = new GCMParameterSpec(n7, (byte[])object3);
        object9 = "AES";
        object3 = new SecretKeySpec((byte[])object2, (String)object9);
        ((Cipher)object4).init(n3, (Key)object3, (AlgorithmParameterSpec)object5);
        ((Cipher)object4).updateAAD((byte[])object);
        object = ((Cipher)object4).doFinal((byte[])object6);
        object3 = StandardCharsets.UTF_8;
        object2 = new String((byte[])object, (Charset)object3);
        object = new StringBuilder((String)object8);
        ((StringBuilder)object).append((String)object2);
        object2 = "\"}";
        ((StringBuilder)object).append((String)object2);
        return ((StringBuilder)object).toString();
    }

    public boolean doesPhonePeAppExist(String string2) {
        long l2;
        int n3;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Context context = this.juspayServices.getContext();
        boolean bl2 = true;
        PackageInfo packageInfo = null;
        context = context.getPackageManager();
        packageInfo = context.getPackageInfo(string2, (int)(bl2 ? 1 : 0));
        try {
            n3 = packageInfo.versionCode;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            string2 = packageInfo;
            String string3 = "jbridge";
            String string4 = "Failed to get phonepe package name";
            String string5 = "debug";
            sdkTracker.trackAction("system", string5, string3, string4, (Object)nameNotFoundException);
            l2 = -1;
        }
        l2 = n3;
        n3 = 0;
        string2 = null;
        if (packageInfo == null) {
            return false;
        }
        long l3 = 94033L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            bl2 = false;
        }
        return bl2;
    }

    public void drawAppIcon(String string2) {
        Object object;
        String string3;
        String string4;
        String string5;
        int n3;
        JuspayServices juspayServices = this.juspayServices;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            juspayServices = new JSONArray(string2);
            string2 = null;
            n3 = 0;
            string5 = null;
        }
        catch (Exception exception) {
            string4 = "jbridge";
            String string6 = "Error happened while parsing json";
            string5 = LOG_TAG;
            string3 = "action";
            object = "system";
            sdkTracker.trackAndLogException(string5, string3, (String)object, string4, string6, exception);
        }
        while (true) {
            int n4 = juspayServices.length();
            if (n3 >= n4) break;
            string3 = juspayServices.getJSONObject(n3);
            object = this.juspayServices;
            object = ((JuspayServices)object).getContext();
            object = object.getPackageManager();
            string4 = "packageName";
            string4 = string3.getString(string4);
            string4 = object.getApplicationInfo(string4, 0);
            object = string4.loadIcon((PackageManager)object);
            string4 = "id";
            string3 = string3.getString(string4);
            n4 = Integer.parseInt(string3);
            this.drawIcon((Drawable)object, n4);
            ++n3;
            continue;
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String encryptJWE(String object, String jSONObject, String objectArray, String hashMap) {
        Exception exception2;
        Object object2;
        int n3;
        block5: {
            Object object3;
            Object object4;
            Object object5;
            byte[] byArray;
            Object object6;
            Object object7;
            block4: {
                block3: {
                    n3 = 1;
                    object2 = "";
                    try {
                        object7 = JBridge.generateAESKey();
                        object7 = object7.getEncoded();
                        object6 = "AES/GCM/NoPadding";
                        object6 = Cipher.getInstance((String)object6);
                        int n4 = ((Cipher)object6).getBlockSize();
                        byArray = new byte[n4];
                        object5 = new SecureRandom();
                        ((SecureRandom)object5).nextBytes(byArray);
                        int n7 = 128;
                        object5 = new GCMParameterSpec(n7, byArray);
                        object4 = "AES";
                        object3 = new SecretKeySpec((byte[])object7, (String)object4);
                        ((Cipher)object6).init(n3, (Key)object3, (AlgorithmParameterSpec)object5);
                        object5 = StandardCharsets.UTF_8;
                        jSONObject = (JSONObject)jSONObject.getBytes((Charset)object5);
                        ((Cipher)object6).updateAAD((byte[])jSONObject);
                        object = ((String)object).getBytes((Charset)object5);
                        object = ((Cipher)object6).doFinal((byte[])object);
                        int n8 = ((Object)object).length + -16;
                        int n10 = ((Object)object).length;
                        object6 = Arrays.copyOfRange((byte[])object, n8, n10);
                        n10 = ((Object)object).length + -16;
                        object = Arrays.copyOfRange((byte[])object, 0, n10);
                        object5 = "sharedPref";
                        boolean bl2 = ((String)((Object)hashMap)).equals(object5);
                        if (!bl2) break block3;
                        bl2 = (objectArray = this.getDataFromSharedPrefs((String)objectArray, (String)object2)).isEmpty();
                        if (bl2) {
                            return "{\"error\":true,\"payload\":\"Key Not Found\"}";
                        }
                        hashMap = "\n";
                        objectArray = objectArray.replaceAll((String)((Object)hashMap), (String)object2);
                        objectArray = this.loadPublicKey((String)objectArray);
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                objectArray = null;
            }
            hashMap = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            hashMap = Cipher.getInstance((String)((Object)hashMap));
            object5 = "SHA-256";
            object3 = "MGF1";
            Object object8 = "SHA-1";
            object4 = new MGF1ParameterSpec((String)object8);
            object8 = PSource.PSpecified.DEFAULT;
            object2 = new OAEPParameterSpec((String)object5, (String)object3, (AlgorithmParameterSpec)object4, (PSource)object8);
            ((Cipher)((Object)hashMap)).init(n3, (Key)objectArray, (AlgorithmParameterSpec)object2);
            objectArray = ((Cipher)((Object)hashMap)).doFinal((byte[])object7);
            hashMap = new HashMap<Object, Object[]>();
            object2 = "protected";
            int n14 = 2;
            jSONObject = Base64.encodeToString((byte[])jSONObject, (int)n14);
            hashMap.put(object2, (Object[])jSONObject);
            jSONObject = "encryptedKey";
            objectArray = Base64.encodeToString((byte[])objectArray, (int)n14);
            hashMap.put(jSONObject, objectArray);
            jSONObject = "iv";
            objectArray = Base64.encodeToString((byte[])byArray, (int)n14);
            hashMap.put(jSONObject, objectArray);
            jSONObject = "cipherText";
            object = Base64.encodeToString((byte[])object, (int)n14);
            hashMap.put(jSONObject, (Object[])object);
            object = "tag";
            jSONObject = Base64.encodeToString((byte[])object6, (int)n14);
            hashMap.put(object, (Object[])jSONObject);
            object = "{\"error\":false,\"payload\":\"%s\"}";
            jSONObject = new JSONObject(hashMap);
            objectArray = new Object[n3];
            objectArray[0] = jSONObject;
            return String.format((String)object, objectArray);
        }
        object2 = this.juspayServices.getSdkTracker();
        Exception exception3 = exception2;
        ((SdkTracker)object2).trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Error in JWE Encryption", exception2);
        jSONObject = new Object[n3];
        jSONObject[0] = exception2;
        return String.format("{\"error\":true,\"payload\":\"%s\"}", (Object[])jSONObject);
    }

    public String encryptRSA(String object, String string2) {
        if ((object = (Object)this.encryptRSAHelper((String)object, string2)) == null) {
            object = "";
        } else {
            int n3 = 2;
            object = Base64.encodeToString((byte[])object, (int)n3);
        }
        return object;
    }

    public byte[] encryptRSAHelper(String object, String string2) {
        Object object2 = "";
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Object object3 = "-----BEGIN PUBLIC KEY-----\n";
        try {
            object = ((String)object).replace((CharSequence)object3, (CharSequence)object2);
            object3 = "-----END PUBLIC KEY-----";
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception when encrypting using RSA", exception);
            return null;
        }
        object = ((String)object).replace((CharSequence)object3, (CharSequence)object2);
        object2 = "RSA";
        object2 = KeyFactory.getInstance((String)object2);
        object = Base64.decode((String)object, (int)0);
        object3 = new X509EncodedKeySpec((byte[])object);
        object = ((KeyFactory)object2).generatePublic((KeySpec)object3);
        object2 = "RSA/ECB/PKCS1Padding";
        object2 = Cipher.getInstance((String)object2);
        int n3 = 1;
        ((Cipher)object2).init(n3, (Key)object);
        object = string2.getBytes();
        return ((Cipher)object2).doFinal((byte[])object);
    }

    public void exitApp(int n3, String string2) {
        SwypeLayout.clear();
        super.exitApp(n3, string2);
    }

    public String findApps(String string2) {
        boolean bl2;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        Object object = new Intent();
        string2 = Uri.parse((String)string2);
        object.setData((Uri)string2);
        string2 = null;
        object = packageManager.queryIntentActivities((Intent)object, 0);
        Object object2 = new ResolveInfo.DisplayNameComparator(packageManager);
        Collections.sort(object, object2);
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = object.iterator();
        while (bl2 = iterator.hasNext()) {
            String string3;
            String string4;
            Throwable throwable;
            String string5;
            String string6;
            block12: {
                object = (ResolveInfo)iterator.next();
                object2 = new JSONObject();
                object = ((ResolveInfo)object).activityInfo;
                object = ((ActivityInfo)object).packageName;
                object = packageManager.getApplicationInfo((String)object, 0);
                string6 = "packageName";
                string5 = ((ApplicationInfo)object).packageName;
                object2.put(string6, (Object)string5);
                string6 = "appName";
                object = packageManager.getApplicationLabel((ApplicationInfo)object);
                object2.put(string6, object);
                try {
                    jSONArray.put(object2);
                    continue;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    throwable = nameNotFoundException;
                }
                catch (JSONException jSONException) {
                    throwable = jSONException;
                    break block12;
                }
                string4 = "jbridge";
                string3 = "Error while searching for the app";
                object2 = LOG_TAG;
                string6 = "action";
                string5 = "system";
                object = sdkTracker;
                sdkTracker.trackAndLogException((String)object2, string6, string5, string4, string3, throwable);
                continue;
            }
            string4 = "jbridge";
            string3 = "Error While add to json";
            object2 = LOG_TAG;
            string6 = "action";
            string5 = "system";
            object = sdkTracker;
            sdkTracker.trackAndLogException((String)object2, string6, string5, string4, string3, throwable);
        }
        return jSONArray.toString();
    }

    public String generateRSAKeyPair(String string2) {
        Object[] objectArray = "RSA";
        String[] stringArray = "AndroidKeyStore";
        try {
            objectArray = KeyPairGenerator.getInstance((String)objectArray, (String)stringArray);
        }
        catch (Exception exception) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Error in generateRSAKeyPair", exception);
            objectArray = new Object[]{exception};
            return String.format("{\"error\":true,\"payload\":\"%s\"}", objectArray);
        }
        b.a();
        string2 = o2.b(string2);
        stringArray = "OAEPPadding";
        stringArray = new String[]{stringArray};
        string2 = ak1_1.a((KeyGenParameterSpec.Builder)string2, stringArray);
        stringArray = "SHA-256";
        stringArray = new String[]{stringArray};
        string2 = bk1_1.a((KeyGenParameterSpec.Builder)string2, stringArray);
        string2 = ck1_2.a((KeyGenParameterSpec.Builder)string2);
        string2 = n2.a((KeyGenParameterSpec.Builder)string2);
        objectArray.initialize((AlgorithmParameterSpec)((Object)string2));
        objectArray.generateKeyPair();
        return "{\"error\":false,\"payload\":\"SUCCESS\"}";
    }

    public String get3DS2SdkList() {
        boolean bl2;
        JSONArray jSONArray = new JSONArray();
        Iterator iterator = this.juspayServices.getJBridgeList().entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object v4 = entry.getValue();
            boolean bl3 = v4 instanceof ThreeDS2Bridge;
            if (!bl3) continue;
            entry = ((ThreeDS2Bridge)entry.getValue()).getThreeDS2SdkName();
            jSONArray.put((Object)entry);
        }
        return jSONArray.toString();
    }

    public String getApplicationContent() {
        return this.juspayServices.getApplicationManager().getApplicationContent();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getBuildInfo() {
        Exception exception2;
        SdkTracker sdkTracker;
        block3: {
            String string2;
            int n3;
            Object object;
            String string3;
            String string4;
            JuspayServices juspayServices;
            block2: {
                juspayServices = this.juspayServices;
                sdkTracker = juspayServices.getSdkTracker();
                try {
                    juspayServices = new JSONObject();
                    string4 = "BOARD";
                    string3 = Build.BOARD;
                    juspayServices.put(string4, string3);
                    string4 = "BRAND";
                    string3 = Build.BRAND;
                    juspayServices.put(string4, string3);
                    string4 = "CPU_ABI";
                    string3 = Build.CPU_ABI;
                    juspayServices.put(string4, string3);
                    string4 = "CPU_ABI2";
                    string3 = Build.CPU_ABI2;
                    juspayServices.put(string4, string3);
                    string4 = "DEVICE";
                    string3 = Build.DEVICE;
                    juspayServices.put(string4, string3);
                    string4 = "DISPLAY";
                    string3 = Build.DISPLAY;
                    juspayServices.put(string4, string3);
                    string4 = "FINGERPRINT";
                    string3 = Build.FINGERPRINT;
                    juspayServices.put(string4, string3);
                    string4 = "HARDWARE";
                    string3 = Build.HARDWARE;
                    juspayServices.put(string4, string3);
                    string4 = "HOST";
                    string3 = Build.HOST;
                    juspayServices.put(string4, string3);
                    string4 = "ID";
                    string3 = Build.ID;
                    juspayServices.put(string4, string3);
                    string4 = "MANUFACTURER";
                    string3 = Build.MANUFACTURER;
                    juspayServices.put(string4, string3);
                    string4 = "MODEL";
                    string3 = Build.MODEL;
                    juspayServices.put(string4, string3);
                    string4 = "PRODUCT";
                    string3 = Build.PRODUCT;
                    juspayServices.put(string4, string3);
                    string4 = "RADIO";
                    string3 = Build.getRadioVersion();
                    juspayServices.put(string4, string3);
                    string4 = "TAGS";
                    string3 = Build.TAGS;
                    juspayServices.put(string4, string3);
                    string4 = "TIME";
                    long l2 = Build.TIME;
                    juspayServices.put(string4, l2);
                    string4 = "USER";
                    string3 = Build.USER;
                    juspayServices.put(string4, string3);
                    string4 = "SUPPORTED_32_BIT_ABIS";
                    object = Build.SUPPORTED_32_BIT_ABIS;
                    string3 = new JSONArray(object);
                    juspayServices.put(string4, string3);
                    string4 = "SUPPORTED_64_BIT_ABIS";
                    object = Build.SUPPORTED_64_BIT_ABIS;
                    string3 = new JSONArray(object);
                    juspayServices.put(string4, string3);
                    string4 = "SUPPORTED_ABIS";
                    object = Build.SUPPORTED_ABIS;
                    string3 = new JSONArray(object);
                    juspayServices.put(string4, string3);
                    string4 = new JSONObject();
                    n3 = Build.VERSION.SDK_INT;
                    int n4 = 23;
                    if (n3 < n4) break block2;
                    object = "BASE_OS";
                    string2 = dk1_2.a();
                    string4.put((String)object, (Object)string2);
                    object = "INCREMENTAL";
                    string2 = Build.VERSION.INCREMENTAL;
                    string4.put((String)object, (Object)string2);
                    object = "PREVIEW_SDK_INT";
                    int n7 = mk3_2.a();
                    string4.put((String)object, n7);
                    object = "SECURITY_PATCH";
                    string2 = ek1_2.a();
                    string4.put((String)object, (Object)string2);
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            object = "RELEASE";
            string2 = Build.VERSION.RELEASE;
            string4.put((String)object, (Object)string2);
            object = "SDK_INT";
            string4.put((String)object, n3);
            string3 = "VERSION";
            juspayServices.put(string3, string4);
            return juspayServices.toString();
        }
        sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception fetching build info", exception2);
        return "";
    }

    public float getDensity() {
        return (float)this.juspayServices.getContext().getResources().getDisplayMetrics().densityDpi / 160.0f;
    }

    public String getDeviceInfo() {
        Object object;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        JSONObject jSONObject = this.juspayServices.getSessionInfo().getSessionData();
        String string2 = "android_id_raw";
        try {
            object = this.juspayServices;
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception while extracting android id", exception);
            return this.getSessionInfo();
        }
        object = ((JuspayServices)object).getSessionInfo();
        object = ((SessionInfo)object).getAndroidId();
        jSONObject.put(string2, object);
        return jSONObject.toString();
    }

    public void getPackageName(String string2) {
        Object object = this.juspayServices;
        SdkTracker sdkTracker = ((JuspayServices)object).getSdkTracker();
        object = this.juspayServices;
        object = ((JuspayServices)object).getContext();
        object = object.getPackageName();
        try {
            this.invokeCallbackInDUIWebview(string2, (String)object);
        }
        catch (Exception exception) {
            String string3 = "jbridge";
            String string4 = "NULL Pointer Exception while getting package name";
            String string5 = LOG_TAG;
            String string6 = "action";
            String string7 = "system";
            sdkTracker.trackAndLogException(string5, string6, string7, string3, string4, exception);
            String string8 = "ERROR";
            this.invokeCallbackInDUIWebview(string2, string8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long getPhonePeVersionCode(String string2) {
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        boolean bl2 = this.doesPhonePeAppExist(string2);
        long l2 = -1;
        if (!bl2) return l2;
        int n3 = 1;
        try {
            string2 = packageManager.getPackageInfo(string2, n3);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return l2;
        }
        int n4 = ((PackageInfo)string2).versionCode;
        return n4;
    }

    public String getPublicKeyAsString(String object) {
        block5: {
            block4: {
                object = this.getPublicKey((String)object);
                if (object == null) break block4;
                object = object.getEncoded();
                SdkTracker sdkTracker = null;
                try {
                    object = Base64.encodeToString((byte[])object, (int)0);
                    break block5;
                }
                catch (Exception exception) {
                    object = this.juspayServices;
                    sdkTracker = ((JuspayServices)object).getSdkTracker();
                    String string2 = "jbridge";
                    String string3 = "Error in getPublicKeyAsString";
                    String string4 = LOG_TAG;
                    String string5 = "action";
                    String string6 = "system";
                    sdkTracker.trackAndLogException(string4, string5, string6, string2, string3, exception);
                }
            }
            object = "";
        }
        return object;
    }

    public String getResourceByName(String string2, String string3, String string4) {
        block7: {
            block6: {
                JuspayServices juspayServices = this.juspayServices;
                SdkTracker sdkTracker = juspayServices.getSdkTracker();
                juspayServices = this.juspayServices;
                juspayServices = juspayServices.getContext();
                juspayServices = juspayServices.getResources();
                int n3 = juspayServices.getIdentifier(string2, string3, string4);
                if (n3 <= 0) break block6;
                try {
                    string2 = super.getResourceById(n3);
                    break block7;
                }
                catch (Exception exception) {
                    String string5 = "jbridge";
                    String string6 = "Get Resource Exception";
                    String string7 = LOG_TAG;
                    String string8 = "action";
                    String string9 = "system";
                    sdkTracker.trackAndLogException(string7, string8, string9, string5, string6, exception);
                }
            }
            string2 = "0";
        }
        return string2;
    }

    public String getSHA256Hash(String object) {
        String string2 = "result is ";
        if (object == null) {
            return null;
        }
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Object object2 = "SHA-256";
        try {
            object2 = MessageDigest.getInstance((String)object2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception caught trying to SHA-256 hash", noSuchAlgorithmException);
            return null;
        }
        object = ((String)object).getBytes();
        ((MessageDigest)object2).update((byte[])object);
        object = ((MessageDigest)object2).digest();
        object = EncryptionHelper.bytesToHexString((byte[])object);
        object2 = LOG_TAG;
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append((String)object);
        string2 = stringBuilder.toString();
        JuspayLogger.d((String)object2, string2);
        return object;
    }

    public String getStatusBarHeight(String string2, String charSequence, String object) {
        block12: {
            block11: {
                String string3 = "";
                JuspayServices juspayServices = this.juspayServices;
                SdkTracker sdkTracker = juspayServices.getSdkTracker();
                juspayServices = this.juspayServices;
                juspayServices = juspayServices.getContext();
                juspayServices = juspayServices.getResources();
                int n3 = juspayServices.getIdentifier(string2, (String)charSequence, (String)object);
                if (n3 <= 0) break block11;
                charSequence = new StringBuilder(string3);
                object = this.juspayServices;
                object = ((JuspayServices)object).getContext();
                object = object.getResources();
                n3 = object.getDimensionPixelSize(n3);
                try {
                    ((StringBuilder)charSequence).append(n3);
                    string2 = ((StringBuilder)charSequence).toString();
                    break block12;
                }
                catch (Exception exception) {
                    String string4 = "jbridge";
                    String string5 = "Get Resource Exception";
                    String string6 = LOG_TAG;
                    String string7 = "action";
                    String string8 = "system";
                    sdkTracker.trackAndLogException(string6, string7, string8, string4, string5, exception);
                }
            }
            string2 = "0";
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleCustomTabResult(Intent object) {
        Exception exception2;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        String string2 = "{}";
        String string3 = "customtab-result-cb";
        if (object != null) {
            try {
                object = object.getExtras();
                object = Utils.toJSON((Bundle)object);
                Object object2 = this.listenerMap;
                object2 = object2.get(string3);
                object2 = (String)object2;
                object = object.toString();
                this.invokeCallbackInDUIWebview((String)object2, (String)object);
                return;
            }
            catch (Exception exception2) {}
        } else {
            object = this.listenerMap;
            object = object.get(string3);
            object = (String)object;
            this.invokeCallbackInDUIWebview((String)object, string2);
            return;
        }
        String string4 = "custom_tab";
        String string5 = "JSON Exception";
        String string6 = LOG_TAG;
        String string7 = "api_call";
        String string8 = "external_sdk";
        sdkTracker.trackAndLogException(string6, string7, string8, string4, string5, exception2);
        String string9 = (String)this.listenerMap.get(string3);
        this.invokeCallbackInDUIWebview(string9, string2);
    }

    public void handlePhonepayActivityResult(String string2) {
        this.invokeCallbackInDUIWebview("", string2);
    }

    public void hideJuspayLoader(String string2) {
        jk1_2 jk1_22 = new jk1_2(this, string2);
        ExecutorManager.runOnMainThread(jk1_22);
    }

    public void hideSoftInput() {
        Activity activity = this.activity;
        if (activity != null && (activity = activity.getCurrentFocus()) != null) {
            activity = this.activity;
            String string2 = "input_method";
            if ((activity = (InputMethodManager)activity.getSystemService(string2)) != null) {
                string2 = this.activity.getCurrentFocus().getWindowToken();
                activity.hideSoftInputFromWindow((IBinder)string2, 0);
            }
        }
    }

    public boolean isCCTSupportedChromeAvailable(String object) {
        JuspayServices juspayServices;
        try {
            juspayServices = this.juspayServices;
        }
        catch (Exception exception) {
            return false;
        }
        juspayServices = juspayServices.getContext();
        object = CustomtabActivity.getCustomTabsPackages((Context)juspayServices, (String)object);
        return CustomtabActivity.isChromeInstalled((ArrayList)object);
    }

    public boolean isNoLimitsActivity() {
        Activity activity = this.activity;
        boolean bl2 = false;
        if (activity == null) {
            return false;
        }
        activity = activity.getWindow().getAttributes();
        int n3 = activity.flags;
        int n4 = 512;
        if ((n3 &= n4) == n4) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean isShimmerPossible() {
        try {}
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    public String jweDecrypt(String string2, String objectArray) {
        JuspayServices juspayServices = this.juspayServices;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            objectArray = EncryptionHelper.getKeyPair((String)objectArray);
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception while trying to decrypt JSON Web Token", exception);
            objectArray = new Object[]{exception};
            return String.format("{\"error\":true,\"payload\":\"%s\"}", objectArray);
        }
        juspayServices = new JSONObject();
        String string3 = "payload";
        objectArray = objectArray.getPrivate();
        string2 = JOSEUtils.jweDecrypt(string2, (PrivateKey)objectArray);
        juspayServices.put(string3, string2);
        string2 = "error";
        juspayServices.put(string2, false);
        return juspayServices.toString();
    }

    public String jweEncrypt(String string2, String objectArray, String object) {
        String string3 = "{\"error\":false,\"payload\":\"";
        JuspayServices juspayServices = this.juspayServices;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        int n3 = 2;
        try {
            object = Base64.decode((String)object, (int)n3);
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception while trying to encrypt JSON Web Token", exception);
            objectArray = new Object[]{exception};
            return String.format("{\"error\":true,\"payload\":\"%s\"}", objectArray);
        }
        string2 = JOSEUtils.jweEncrypt(string2, (String)objectArray, (byte[])object);
        objectArray = new StringBuilder(string3);
        objectArray.append(string2);
        string2 = "\"}";
        objectArray.append(string2);
        return objectArray.toString();
    }

    public String jwsSign(String string2, String objectArray, String object) {
        String string3 = "{\"error\":false,\"payload\":\"";
        JuspayServices juspayServices = this.juspayServices;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        try {
            object = EncryptionHelper.getKeyPair((String)object);
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception while trying to sign JSON Web Token", exception);
            objectArray = new Object[]{exception};
            return String.format("{\"error\":true,\"payload\":\"%s\"}", objectArray);
        }
        object = ((KeyPair)object).getPrivate();
        string2 = JOSEUtils.jwsSign(string2, (String)objectArray, (PrivateKey)object);
        objectArray = new StringBuilder(string3);
        objectArray.append(string2);
        string2 = "\"}";
        objectArray.append(string2);
        return objectArray.toString();
    }

    public boolean jwsVerify(String string2, String object) {
        JuspayServices juspayServices = this.juspayServices;
        SdkTracker sdkTracker = juspayServices.getSdkTracker();
        int n3 = 2;
        try {
            object = Base64.decode((String)object, (int)n3);
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception while trying to verify JSON Web Token", exception);
            return false;
        }
        return JOSEUtils.jwsVerify(string2, (byte[])object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void launchCustomTab(String object, String string2) {
        Exception exception2;
        Object object2;
        Object object3;
        SdkTracker sdkTracker;
        block3: {
            sdkTracker = this.juspayServices.getSdkTracker();
            object3 = this.listenerMap;
            object2 = "customtab-result-cb";
            object3.put(object2, string2);
            try {
                object3 = this.juspayServices;
                boolean bl2 = ((JuspayServices)object3).isPaused();
                if (bl2) {
                    object2 = LOG_TAG;
                    String string3 = "api_call";
                    String string4 = "external_sdk";
                    String string5 = "custom_tab";
                    String string6 = "onPause called before launch customtab";
                    object3 = sdkTracker;
                    sdkTracker.trackAction((String)object2, string3, string4, string5, string6);
                    this.unRegisterReceiver();
                    object = new JSONObject();
                    object3 = "status";
                    object2 = "onPause";
                    object.put((String)object3, object2);
                    object = object.toString();
                    this.invokeCallbackInDUIWebview(string2, (String)object);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object2 = this.juspayServices;
            object2 = ((JuspayServices)object2).getContext();
            Class<CustomtabActivity> clazz = CustomtabActivity.class;
            object3 = new Intent((Context)object2, clazz);
            object2 = "url";
            object3.putExtra((String)object2, (String)object);
            object = "customtab-result";
            this.registerReceiver((String)object);
            object = this.juspayServices;
            int n3 = -1;
            clazz = null;
            ((JuspayServices)object).startActivityForResult((Intent)object3, n3, null);
            return;
        }
        String string7 = "custom_tab";
        String string8 = "Exception at launch customtab";
        object2 = LOG_TAG;
        String string9 = "api_call";
        String string10 = "external_sdk";
        object3 = sdkTracker;
        sdkTracker.trackAndLogException((String)object2, string9, string10, string7, string8, exception2);
        this.unRegisterReceiver();
        String string11 = ((Object)exception2).toString();
        this.invokeCallbackInDUIWebview(string2, string11);
    }

    public void openApp(String string2, String string3, String string4, int n3, int n4) {
        Intent intent = new Intent();
        intent.setPackage(string2);
        intent.setAction(string4);
        string2 = Uri.parse((String)string3);
        intent.setData((Uri)string2);
        intent.setFlags(n3);
        this.juspayServices.startActivityForResult(intent, n4, null);
    }

    public String readResource(String string2) {
        return this.juspayServices.getApplicationManager().readResourceByName(string2);
    }

    public String readSplit(String string2) {
        return this.juspayServices.getApplicationManager().readSplit(string2);
    }

    public String readSplits(String string2) {
        return this.juspayServices.getApplicationManager().readSplits(string2);
    }

    public void registerReceiver(String string2) {
        Object object = this.broadcastReceiver;
        if (object != null) {
            return;
        }
        object = new JBridge$1(this);
        this.broadcastReceiver = object;
        object = Xv1.a(this.juspayServices.getContext());
        BroadcastReceiver broadcastReceiver2 = this.broadcastReceiver;
        IntentFilter intentFilter = new IntentFilter(string2);
        ((Xv1)object).b(broadcastReceiver2, intentFilter);
    }

    public void reset() {
        super.reset();
        this.unRegisterReceiver();
    }

    public String rsaEncryption(String object, String object2, String object3) {
        int n3;
        int n4 = 1;
        String string2 = "{\"error\":false,\"payload\":\"";
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Object object4 = "RSA";
        try {
            object4 = KeyFactory.getInstance((String)object4);
            n3 = 2;
        }
        catch (Exception exception) {
            sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "jbridge", "Exception while trying to encrypt using RSA", exception);
            object2 = new Object[n4];
            object2[0] = exception;
            return String.format("{\"error\":true,\"payload\":\"%s\"}", (Object[])object2);
        }
        object3 = Base64.decode((String)object3, (int)n3);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object3);
        object3 = ((KeyFactory)object4).generatePublic(x509EncodedKeySpec);
        object3 = (RSAPublicKey)object3;
        object2 = Cipher.getInstance((String)object2);
        ((Cipher)object2).init(n4, (Key)object3);
        object = ((String)object).getBytes();
        object = ((Cipher)object2).doFinal((byte[])object);
        object = Base64.encodeToString((byte[])object, (int)n3);
        object2 = new StringBuilder(string2);
        ((StringBuilder)object2).append((String)object);
        object = "\"}";
        ((StringBuilder)object2).append((String)object);
        return ((StringBuilder)object2).toString();
    }

    public void shareLink(String object, String string2, String string3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String)object);
        object = this.juspayServices;
        string2 = Intent.createChooser((Intent)intent, (CharSequence)string2);
        ((JuspayServices)object).startActivityForResult((Intent)string2, -1, null);
        this.invokeCallbackInDUIWebview(string3, "true");
    }

    public void showJuspayLoader(String string2) {
        ik1_2 ik1_22 = new ik1_2(this, string2);
        ExecutorManager.runOnMainThread(ik1_22);
    }

    public void startDatePicker(String string2, String string3, String string4) {
        this.startDatePicker(string2, string3, string4, null, 2, false);
    }

    public void startDatePicker(String string2, String string3, String string4, String string5, int n3, boolean bl2) {
        gk1_2 gk1_22 = new gk1_2(this, string2, string5, n3, string3, string4, bl2);
        ExecutorManager.runOnMainThread(gk1_22);
    }

    public void startLottieAnimation(int n3, String string2, boolean bl2, float f5, float f6) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        hk1_2 hk1_22 = new hk1_2(this, n3, string2, bl2, f5, f6, sdkTracker);
        ExecutorManager.runOnMainThread(hk1_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startPaytmRequest(String string2, String string3, String string4) {
        JSONException jSONException2;
        SdkTracker sdkTracker;
        Object object;
        JBridge jBridge;
        block3: {
            int n3;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            boolean bl2;
            String string10;
            String string11;
            jBridge = this;
            Object object2 = "nativeSdkEnabled";
            object = "price";
            String string12 = "paytm_invoke";
            String string13 = "enable_paytm_invoke";
            String string14 = "nativeSdkForMerchantAmount";
            JuspayServices juspayServices = this.juspayServices;
            sdkTracker = juspayServices.getSdkTracker();
            try {
                string11 = string2;
                juspayServices = new JSONObject(string2);
                string11 = "8.6.0";
                string10 = string3;
                bl2 = this.versionCompare(string3, string11);
                string10 = null;
                string9 = "paymentmode";
                string8 = "net.one97.paytm";
                string7 = "txnToken";
                string6 = "mid";
                string5 = "orderid";
                n3 = 116;
                if (bl2 < false) {
                    object2 = new Intent();
                    object = new Bundle();
                    string12 = juspayServices.optString(string14);
                    object.putString(string14, string12);
                    string12 = juspayServices.optString(string5);
                    object.putString(string5, string12);
                    string12 = juspayServices.optString(string6);
                    object.putString(string6, string12);
                    string12 = juspayServices.optString(string7);
                    object.putString(string7, string12);
                    string13 = juspayServices.optString(string8);
                    string12 = new ComponentName(string8, string13);
                    object2.setComponent((ComponentName)string12);
                    int n4 = juspayServices.optInt(string9);
                    object2.putExtra(string9, n4);
                    string12 = "bill";
                    object2.putExtra(string12, (Bundle)object);
                    object = this.juspayServices;
                    ((JuspayServices)object).startActivityForResult((Intent)object2, n3, null);
                    object = this.juspayServices;
                    string12 = "paytmSDkParams1";
                    object2 = object2.toString();
                    ((JuspayServices)object).sdkDebug(string12, (String)object2);
                    return;
                }
            }
            catch (JSONException jSONException2) {
                break block3;
            }
            string14 = new Intent();
            string10 = juspayServices.optString(string8);
            string11 = new ComponentName(string8, string10);
            string14.setComponent((ComponentName)string11);
            bl2 = juspayServices.optInt(string9);
            string14.putExtra(string9, (int)(bl2 ? 1 : 0));
            bl2 = juspayServices.optBoolean(string13);
            string14.putExtra(string13, bl2);
            boolean bl3 = juspayServices.optBoolean(string12);
            string14.putExtra(string12, bl3);
            string12 = juspayServices.optString((String)object);
            string14.putExtra((String)object, string12);
            boolean bl4 = juspayServices.optBoolean((String)object2);
            string14.putExtra((String)object2, bl4);
            object2 = juspayServices.optString(string5);
            string14.putExtra(string5, (String)object2);
            object2 = juspayServices.optString(string7);
            string14.putExtra(string7, (String)object2);
            object2 = juspayServices.optString(string6);
            string14.putExtra(string6, (String)object2);
            object2 = this.juspayServices;
            bl4 = false;
            object = null;
            ((JuspayServices)object2).startActivityForResult((Intent)string14, n3, null);
            object2 = this.juspayServices;
            object = "paytmSDkParams2";
            string12 = string14.toString();
            ((JuspayServices)object2).sdkDebug((String)object, string12);
            return;
        }
        String string15 = "paytm_utils";
        String string16 = "Paytm Init Exception";
        String string17 = LOG_TAG;
        String string18 = "api_call";
        String string19 = "external_sdk";
        JSONException jSONException3 = jSONException2;
        sdkTracker.trackAndLogException(string17, string18, string19, string15, string16, jSONException2);
        String string20 = ((Object)((Object)jSONException2)).toString();
        object = string4;
        jBridge.invokeCallbackInDUIWebview(string4, string20);
    }

    public void startPhonepeRequest(String string2, String string3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        string2 = Uri.parse((String)string2);
        intent.setData((Uri)string2);
        intent.setPackage(string3);
        this.juspayServices.startActivityForResult(intent, 113, null);
    }

    public void startPhonepeRequest(String string2, String string3, String string4, String string5) {
        this.invokeCallbackInDUIWebview(string5, "Function deprecated");
    }

    public void unRegisterReceiver() {
        Object object = this.broadcastReceiver;
        if (object == null) {
            return;
        }
        object = Xv1.a(this.juspayServices.getContext());
        BroadcastReceiver broadcastReceiver2 = this.broadcastReceiver;
        ((Xv1)object).d(broadcastReceiver2);
        this.broadcastReceiver = null;
    }

    public void writeFileToDisk(String string2, String string3, String string4) {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        Context context = this.juspayServices.getContext();
        string2 = fileProviderService.writeFileToDisk(context, string2, string3);
        this.invokeCallbackInDUIWebview(string4, string2);
    }
}

