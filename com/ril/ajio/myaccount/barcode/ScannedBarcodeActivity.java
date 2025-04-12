/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.barcode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.b;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.CameraSource$Builder;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Detector$Detections;
import com.google.android.gms.vision.Detector$Processor;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector$Builder;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.myaccount.barcode.ScannedBarcodeActivity$a;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class ScannedBarcodeActivity
extends AppCompatActivity
implements SurfaceHolder.Callback,
Detector$Processor,
View.OnClickListener {
    public static final ScannedBarcodeActivity$a Companion;
    public TextView X;
    public SurfaceView Y;
    public CameraSource Z;

    static {
        ScannedBarcodeActivity$a scannedBarcodeActivity$a;
        Companion = scannedBarcodeActivity$a = new Object();
    }

    public void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.tv_find_product_code;
        if (n3 == n4) {
            Yz2.Companion.getClass();
            n3 = 0;
            n4 = 2;
            object = Yz2$a.a(n4, false, false, null);
            object2 = this.getSupportFragmentManager();
            String string2 = "ProductCodeFragment";
            ((DialogFragment)object).show((FragmentManager)object2, string2);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$layout.activity_barcode_scanner;
        this.setContentView(n3);
        n3 = R$id.surfaceView;
        bundle = (SurfaceView)this.findViewById(n3);
        this.Y = bundle;
        n3 = R$id.tv_find_product_code;
        bundle = (TextView)this.findViewById(n3);
        this.X = bundle;
        n3 = R$id.imv_up;
        bundle = (ImageView)this.findViewById(n3);
        bundle = this.X;
        if (bundle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("findProductCodeTv");
            n3 = 0;
            bundle = null;
        }
        bundle.setOnClickListener((View.OnClickListener)this);
    }

    public final void onPause() {
        super.onPause();
        CameraSource cameraSource = this.Z;
        if (cameraSource != null) {
            cameraSource.release();
        }
    }

    public final void onRequestPermissionsResult(int n3, String[] surfaceView, int[] nArray) {
        Intrinsics.checkNotNullParameter(surfaceView, "permissions");
        String string2 = "grantResults";
        Intrinsics.checkNotNullParameter(nArray, string2);
        super.onRequestPermissionsResult(n3, (String[])surfaceView, nArray);
        int n4 = 201;
        if (n3 == n4) {
            Object object;
            n3 = nArray.length;
            n4 = 0;
            surfaceView = null;
            int n7 = 1;
            if (n3 == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            if ((n3 ^= n7) != 0 && (n3 = nArray[0]) == 0) {
                object = "android.permission.CAMERA";
                n3 = t70.checkSelfPermission((Context)this, (String)object);
                if (n3 != 0) {
                    return;
                }
                object = this.Z;
                if (object != null) {
                    surfaceView = this.Y;
                    if (surfaceView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
                        n4 = 0;
                        surfaceView = null;
                    }
                    surfaceView = surfaceView.getHolder();
                    ((CameraSource)object).start((SurfaceHolder)surfaceView);
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = new BarcodeDetector$Builder((Context)this);
        object = ((BarcodeDetector$Builder)object).setBarcodeFormats(0).build();
        CameraSource$Builder cameraSource$Builder = new CameraSource$Builder((Context)this, (Detector)object);
        int n3 = 1920;
        int n4 = 1080;
        cameraSource$Builder = cameraSource$Builder.setRequestedPreviewSize(n3, n4);
        Object object2 = cameraSource$Builder.setFacing(0);
        boolean bl2 = true;
        this.Z = object2 = ((CameraSource$Builder)object2).setAutoFocusEnabled(bl2).build();
        object2 = this.Y;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
            object2 = null;
        }
        object2.getHolder().addCallback((SurfaceHolder.Callback)this);
        ((Detector)object).setProcessor(this);
    }

    public final void receiveDetections(Detector$Detections object) {
        String string2 = "detections";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Detector$Detections)object).getDetectedItems();
        int n3 = object.size();
        if (n3 != 0) {
            n3 = 0;
            string2 = null;
            Object object2 = object.valueAt(0);
            if (object2 != null) {
                if ((object = (Barcode)object.valueAt(0)) == null || (object = ((Barcode)object).displayValue) == null) {
                    object = "";
                }
                string2 = new Intent();
                object2 = new Bundle();
                String string3 = "BARCODE_DATA";
                object2.putString(string3, (String)object);
                string2.putExtras((Bundle)object2);
                int n4 = -1;
                this.setResult(n4, (Intent)string2);
                this.finish();
            }
        }
    }

    public final void release() {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(surfaceHolder, "holder");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void surfaceCreated(SurfaceHolder object) {
        String string2 = "android.permission.CAMERA";
        String string3 = "holder";
        Intrinsics.checkNotNullParameter(object, string3);
        try {
            int n3 = t70.checkSelfPermission((Context)this, string2);
            if (n3 != 0) {
                object = new String[]{string2};
                int n4 = 201;
                b.a(n4, this, object);
                return;
            }
            object = this.Z;
            if (object == null) return;
            string2 = this.Y;
            if (string2 == null) {
                string2 = "surfaceView";
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl2 = false;
                string2 = null;
            }
            string2 = string2.getHolder();
            object.start((SurfaceHolder)string2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void surfaceDestroyed(SurfaceHolder object) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.Z;
        if (object != null) {
            ((CameraSource)object).stop();
        }
    }
}

