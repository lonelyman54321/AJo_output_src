/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 */
package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment$1;
import androidx.fragment.app.DialogFragment$a;
import androidx.fragment.app.DialogFragment$b;
import androidx.fragment.app.DialogFragment$c;
import androidx.fragment.app.DialogFragment$d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$o;
import androidx.fragment.app.FragmentManager$p;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.lifecycle.LiveData;

public class DialogFragment
extends Fragment
implements DialogInterface.OnCancelListener,
DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private F62 mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public DialogFragment() {
        boolean bl2;
        Object object = new DialogFragment$1(this);
        this.mDismissRunnable = object;
        object = new DialogFragment$a(this);
        this.mOnCancelListener = object;
        object = new DialogFragment$b(this);
        this.mOnDismissListener = object;
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = bl2 = true;
        this.mShowsDialog = bl2;
        this.mBackStackId = -1;
        DialogFragment$c dialogFragment$c = new DialogFragment$c(this);
        this.mObserver = dialogFragment$c;
        this.mDialogCreated = false;
    }

    public DialogFragment(int n3) {
        super(n3);
        boolean bl2;
        Object object = new DialogFragment$1(this);
        this.mDismissRunnable = object;
        object = new DialogFragment$a(this);
        this.mOnCancelListener = object;
        object = new DialogFragment$b(this);
        this.mOnDismissListener = object;
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = bl2 = true;
        this.mShowsDialog = bl2;
        this.mBackStackId = -1;
        DialogFragment$c dialogFragment$c = new DialogFragment$c(this);
        this.mObserver = dialogFragment$c;
        this.mDialogCreated = false;
    }

    public static /* synthetic */ Dialog access$000(DialogFragment dialogFragment) {
        return dialogFragment.mDialog;
    }

    public static /* synthetic */ DialogInterface.OnDismissListener access$100(DialogFragment dialogFragment) {
        return dialogFragment.mOnDismissListener;
    }

    public static /* synthetic */ boolean access$200(DialogFragment dialogFragment) {
        return dialogFragment.mShowsDialog;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void dismissInternal(boolean bl2, boolean n3, boolean n4) {
        int n7;
        Object object;
        int n8;
        int n10 = (int)(this.mDismissed ? 1 : 0);
        if (n10 != 0) {
            return;
        }
        n10 = 1;
        this.mDismissed = n10;
        int n14 = 0;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            Dialog dialog2 = this.mDialog;
            dialog2.dismiss();
            if (n8 == 0) {
                Looper looper;
                object = Looper.myLooper();
                if (object == (looper = this.mHandler.getLooper())) {
                    object = this.mDialog;
                    this.onDismiss((DialogInterface)object);
                } else {
                    object = this.mHandler;
                    Runnable runnable2 = this.mDismissRunnable;
                    object.post(runnable2);
                }
            }
        }
        this.mViewDestroyed = n10;
        n8 = this.mBackStackId;
        if (n8 >= 0) {
            int n15;
            object = "Bad id: ";
            if (n7 != 0) {
                Object object2 = this.getParentFragmentManager();
                n7 = this.mBackStackId;
                if (n7 < 0) {
                    object2.getClass();
                    object = hj0_0.a(n7, (String)object);
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
                ((FragmentManager)object2).X(n7, n10, null);
            } else {
                FragmentManager fragmentManager = this.getParentFragmentManager();
                n14 = this.mBackStackId;
                fragmentManager.getClass();
                if (n14 < 0) {
                    object = hj0_0.a(n14, (String)object);
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                }
                object = new FragmentManager$p(fragmentManager, null, n14, n10);
                fragmentManager.x((FragmentManager$o)object, bl2);
            }
            this.mBackStackId = n15 = -1;
            return;
        }
        object = this.getParentFragmentManager();
        object = Vp0.a((FragmentManager)object, (FragmentManager)object);
        ((k)object).p = n10;
        ((a)object).i(this);
        if (n7 != 0) {
            ((a)object).p();
            return;
        }
        if (bl2) {
            ((a)object).o(n10 != 0, n10 != 0);
            return;
        }
        ((a)object).d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void prepareDialog(Bundle bundle) {
        Throwable throwable2;
        block6: {
            block7: {
                block5: {
                    Dialog dialog;
                    boolean bl2;
                    boolean bl3 = this.mShowsDialog;
                    if (!bl3) {
                        return;
                    }
                    bl3 = this.mDialogCreated;
                    if (bl3) return;
                    bl3 = false;
                    boolean bl4 = true;
                    try {
                        this.mCreatingDialog = bl4;
                        bundle = this.onCreateDialog(bundle);
                        this.mDialog = bundle;
                        bl2 = this.mShowsDialog;
                        if (!bl2) break block5;
                        bl2 = this.mStyle;
                        this.setupDialog((Dialog)bundle, (int)(bl2 ? 1 : 0));
                        bundle = this.getContext();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    bl2 = bundle instanceof Activity;
                    if (bl2) {
                        dialog = this.mDialog;
                        bundle = (Activity)bundle;
                        dialog.setOwnerActivity((Activity)bundle);
                    }
                    bundle = this.mDialog;
                    bl2 = this.mCancelable;
                    bundle.setCancelable(bl2);
                    bundle = this.mDialog;
                    dialog = this.mOnCancelListener;
                    bundle.setOnCancelListener((DialogInterface.OnCancelListener)dialog);
                    bundle = this.mDialog;
                    dialog = this.mOnDismissListener;
                    bundle.setOnDismissListener((DialogInterface.OnDismissListener)dialog);
                    this.mDialogCreated = bl4;
                    break block7;
                }
                bundle = null;
                this.mDialog = null;
            }
            this.mCreatingDialog = false;
            return;
        }
        this.mCreatingDialog = false;
        throw throwable2;
    }

    public cw0_0 createFragmentContainer() {
        cw0_0 cw0_02 = super.createFragmentContainer();
        DialogFragment$d dialogFragment$d = new DialogFragment$d(this, cw0_02);
        return dialogFragment$d;
    }

    public void dismiss() {
        this.dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        this.dismissInternal(true, false, false);
    }

    public void dismissNow() {
        this.dismissInternal(false, false, true);
    }

    public void e4() {
        this.dismiss();
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context object) {
        super.onAttach((Context)object);
        object = this.getViewLifecycleOwnerLiveData();
        F62 f62 = this.mObserver;
        ((LiveData)object).f(f62);
        boolean bl2 = this.mShownByMe;
        if (!bl2) {
            bl2 = false;
            object = null;
            this.mDismissed = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        Object object;
        super.onCreate(bundle);
        this.mHandler = object = new Handler();
        int n3 = this.mContainerId;
        int n4 = 1;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        this.mShowsDialog = n3;
        if (bundle != null) {
            int n7;
            this.mStyle = n3 = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = n3 = bundle.getInt(SAVED_THEME, 0);
            n3 = (int)(bundle.getBoolean(SAVED_CANCELABLE, n4 != 0) ? 1 : 0);
            this.mCancelable = n3;
            n4 = this.mShowsDialog;
            n3 = (int)(bundle.getBoolean(SAVED_SHOWS_DIALOG, n4 != 0) ? 1 : 0);
            this.mShowsDialog = n3;
            object = SAVED_BACK_STACK_ID;
            n4 = -1;
            this.mBackStackId = n7 = bundle.getInt((String)object, n4);
        }
    }

    public Dialog onCreateDialog(Bundle object) {
        object = "FragmentManager";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)object, (int)n3);
        if (bl2) {
            this.toString();
        }
        Context context = this.requireContext();
        int n4 = this.getTheme();
        object = new i10_0(context, n4);
        return object;
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            dialog = this.mDialog;
            dialog.dismiss();
            boolean bl2 = this.mDismissed;
            if (!bl2) {
                dialog = this.mDialog;
                this.onDismiss((DialogInterface)dialog);
            }
            this.mDialog = null;
            bl2 = false;
            dialog = null;
            this.mDialogCreated = false;
        }
    }

    public void onDetach() {
        super.onDetach();
        boolean bl2 = this.mShownByMe;
        if (!bl2 && !(bl2 = this.mDismissed)) {
            this.mDismissed = bl2 = true;
        }
        LiveData liveData = this.getViewLifecycleOwnerLiveData();
        F62 f62 = this.mObserver;
        liveData.j(f62);
    }

    public void onDismiss(DialogInterface object) {
        boolean bl2 = this.mViewDestroyed;
        if (!bl2) {
            object = "FragmentManager";
            int bl3 = 3;
            bl2 = Log.isLoggable((String)object, (int)bl3);
            if (bl2) {
                this.toString();
            }
            bl2 = false;
            object = null;
            boolean bl4 = true;
            this.dismissInternal(bl4, bl4, false);
        }
    }

    public View onFindViewById(int n3) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(n3);
        }
        return null;
    }

    public LayoutInflater onGetLayoutInflater(Bundle object) {
        LayoutInflater layoutInflater = super.onGetLayoutInflater((Bundle)object);
        boolean bl2 = this.mShowsDialog;
        String string2 = "FragmentManager";
        int n3 = 2;
        if (bl2 && !(bl2 = this.mCreatingDialog)) {
            this.prepareDialog((Bundle)object);
            boolean bl3 = Log.isLoggable((String)string2, (int)n3);
            if (bl3) {
                this.toString();
            }
            if ((object = this.mDialog) != null) {
                object = object.getContext();
                layoutInflater = layoutInflater.cloneInContext((Context)object);
            }
            return layoutInflater;
        }
        boolean bl4 = Log.isLoggable((String)string2, (int)n3);
        if (bl4) {
            String string3 = "getting layout inflater for DialogFragment ";
            object = new StringBuilder(string3);
            ((StringBuilder)object).append(this);
        }
        return layoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    public void onSaveInstanceState(Bundle bundle) {
        int n3;
        int n4;
        String string2;
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog = dialog.onSaveInstanceState();
            dialog.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            string2 = SAVED_DIALOG_STATE_TAG;
            bundle.putBundle(string2, (Bundle)dialog);
        }
        if ((n4 = this.mStyle) != 0) {
            string2 = SAVED_STYLE;
            bundle.putInt(string2, n4);
        }
        if ((n4 = this.mTheme) != 0) {
            string2 = SAVED_THEME;
            bundle.putInt(string2, n4);
        }
        if ((n4 = (int)(this.mCancelable ? 1 : 0)) == 0) {
            string2 = SAVED_CANCELABLE;
            bundle.putBoolean(string2, n4 != 0);
        }
        if ((n4 = (int)(this.mShowsDialog ? 1 : 0)) == 0) {
            string2 = SAVED_SHOWS_DIALOG;
            bundle.putBoolean(string2, n4 != 0);
        }
        if ((n4 = this.mBackStackId) != (n3 = -1)) {
            string2 = SAVED_BACK_STACK_ID;
            bundle.putInt(string2, n4);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            dialog = this.mDialog.getWindow().getDecorView();
            VD3.b((View)dialog, this);
            ae3_0.b((View)dialog, this);
            ZD3.b((View)dialog, this);
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        Object object = this.mDialog;
        if (object != null && bundle != null && (bundle = bundle.getBundle((String)(object = SAVED_DIALOG_STATE_TAG))) != null) {
            object = this.mDialog;
            object.onRestoreInstanceState(bundle);
        }
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.performCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater = this.mView;
        if (layoutInflater == null && (layoutInflater = this.mDialog) != null && bundle != null && (layoutInflater = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) != null) {
            viewGroup = this.mDialog;
            viewGroup.onRestoreInstanceState((Bundle)layoutInflater);
        }
    }

    public final i10_0 requireComponentDialog() {
        Object object = this.requireDialog();
        boolean bl2 = object instanceof i10_0;
        if (bl2) {
            return (i10_0)object;
        }
        StringBuilder stringBuilder = new StringBuilder("DialogFragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not return a ComponentDialog instance from requireDialog(). The actual Dialog is ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final Dialog requireDialog() {
        Object object = this.getDialog();
        if (object != null) {
            return object;
        }
        CharSequence charSequence = new StringBuilder("DialogFragment ");
        charSequence.append(this);
        charSequence.append(" does not have a Dialog.");
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public void setCancelable(boolean bl2) {
        this.mCancelable = bl2;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(bl2);
        }
    }

    public void setShowsDialog(boolean bl2) {
        this.mShowsDialog = bl2;
    }

    public void setStyle(int n3, int n4) {
        String string2 = "FragmentManager";
        int n7 = 2;
        int n8 = Log.isLoggable((String)string2, (int)n7);
        if (n8 != 0) {
            this.toString();
        }
        this.mStyle = n3;
        if (n3 == n7 || n3 == (n8 = 3)) {
            this.mTheme = n3 = 16973913;
        }
        if (n4 != 0) {
            this.mTheme = n4;
        }
    }

    public void setupDialog(Dialog dialog, int n3) {
        block5: {
            int n4;
            block4: {
                int n7;
                n4 = 1;
                if (n3 == n4 || n3 == (n7 = 2)) break block4;
                n7 = 3;
                if (n3 != n7) break block5;
                Window window = dialog.getWindow();
                if (window != null) {
                    n7 = 24;
                    window.addFlags(n7);
                }
            }
            dialog.requestWindowFeature(n4);
        }
    }

    public int show(k k2, String string2) {
        int n3;
        this.mDismissed = false;
        int n4 = 1;
        this.mShownByMe = n4;
        k2.h(0, this, string2, n4);
        this.mViewDestroyed = false;
        this.mBackStackId = n3 = k2.d();
        return n3;
    }

    public void show(FragmentManager object, String string2) {
        this.mDismissed = false;
        int n3 = 1;
        this.mShownByMe = n3;
        object = Vp0.a((FragmentManager)object, (FragmentManager)object);
        ((k)object).p = n3;
        ((a)object).h(0, this, string2, n3);
        ((a)object).d();
    }

    public void showNow(FragmentManager object, String string2) {
        this.mDismissed = false;
        int n3 = 1;
        this.mShownByMe = n3;
        object = Vp0.a((FragmentManager)object, (FragmentManager)object);
        ((k)object).p = n3;
        ((a)object).h(0, this, string2, n3);
        ((a)object).p();
    }
}

