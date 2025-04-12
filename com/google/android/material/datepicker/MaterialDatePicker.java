/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CalendarConstraints$Builder;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialDatePicker$1;
import com.google.android.material.datepicker.MaterialDatePicker$2;
import com.google.android.material.datepicker.MaterialDatePicker$3;
import com.google.android.material.datepicker.MaterialDatePicker$4;
import com.google.android.material.datepicker.MaterialDatePicker$Builder;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.datepicker.MaterialTextInputPicker;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.PickerFragment;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class MaterialDatePicker
extends DialogFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    static final Object CANCEL_BUTTON_TAG;
    static final Object CONFIRM_BUTTON_TAG;
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_RES_ID_KEY = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final String POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String POSITIVE_BUTTON_TEXT_RES_ID_KEY = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    static final Object TOGGLE_BUTTON_TAG;
    private MaterialShapeDrawable background;
    private MaterialCalendar calendar;
    private CalendarConstraints calendarConstraints;
    private Button confirmButton;
    private DateSelector dateSelector;
    private DayViewDecorator dayViewDecorator;
    private boolean edgeToEdgeEnabled;
    private CharSequence fullTitleText;
    private boolean fullscreen;
    private TextView headerSelectionText;
    private TextView headerTitleTextView;
    private CheckableImageButton headerToggleButton;
    private int inputMode;
    private CharSequence negativeButtonContentDescription;
    private int negativeButtonContentDescriptionResId;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private final LinkedHashSet onCancelListeners;
    private final LinkedHashSet onDismissListeners;
    private final LinkedHashSet onNegativeButtonClickListeners;
    private final LinkedHashSet onPositiveButtonClickListeners;
    private int overrideThemeResId;
    private PickerFragment pickerFragment;
    private CharSequence positiveButtonContentDescription;
    private int positiveButtonContentDescriptionResId;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private CharSequence singleLineTitleText;
    private CharSequence titleText;
    private int titleTextResId;

    static {
        CONFIRM_BUTTON_TAG = "CONFIRM_BUTTON_TAG";
        CANCEL_BUTTON_TAG = "CANCEL_BUTTON_TAG";
        TOGGLE_BUTTON_TAG = "TOGGLE_BUTTON_TAG";
    }

    public MaterialDatePicker() {
        LinkedHashSet linkedHashSet;
        this.onPositiveButtonClickListeners = linkedHashSet = new LinkedHashSet();
        this.onNegativeButtonClickListeners = linkedHashSet = new LinkedHashSet();
        this.onCancelListeners = linkedHashSet = new LinkedHashSet();
        this.onDismissListeners = linkedHashSet = new LinkedHashSet();
    }

    public static /* synthetic */ void Oa(MaterialDatePicker materialDatePicker, View view) {
        materialDatePicker.lambda$initHeaderToggle$0(view);
    }

    public static /* synthetic */ LinkedHashSet access$000(MaterialDatePicker materialDatePicker) {
        return materialDatePicker.onPositiveButtonClickListeners;
    }

    public static /* synthetic */ LinkedHashSet access$100(MaterialDatePicker materialDatePicker) {
        return materialDatePicker.onNegativeButtonClickListeners;
    }

    public static /* synthetic */ DateSelector access$200(MaterialDatePicker materialDatePicker) {
        return materialDatePicker.getDateSelector();
    }

    public static /* synthetic */ Button access$300(MaterialDatePicker materialDatePicker) {
        return materialDatePicker.confirmButton;
    }

    private static Drawable createHeaderToggleDrawable(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] nArray = new int[]{0x10100A0};
        int n3 = R$drawable.material_ic_calendar_black_24dp;
        Drawable drawable2 = xn.a(context, n3);
        stateListDrawable.addState(nArray, drawable2);
        nArray = new int[]{};
        n3 = R$drawable.material_ic_edit_black_24dp;
        context = xn.a(context, n3);
        stateListDrawable.addState(nArray, (Drawable)context);
        return stateListDrawable;
    }

    private void enableEdgeToEdgeIfNeeded(Window object) {
        boolean bl2 = this.edgeToEdgeEnabled;
        if (bl2) {
            return;
        }
        View view = this.requireView();
        int n3 = R$id.fullscreen_header;
        view = view.findViewById(n3);
        Integer n4 = ViewUtils.getBackgroundColor(view);
        boolean bl3 = true;
        EdgeToEdgeUtils.applyEdgeToEdge(object, bl3, n4, null);
        int n7 = view.getPaddingTop();
        n3 = view.getLayoutParams().height;
        MaterialDatePicker$3 materialDatePicker$3 = new MaterialDatePicker$3(this, n3, view, n7);
        object = ViewCompat.a;
        ViewCompat$c.o(view, materialDatePicker$3);
        this.edgeToEdgeEnabled = bl3;
    }

    private DateSelector getDateSelector() {
        DateSelector dateSelector = this.dateSelector;
        if (dateSelector == null) {
            dateSelector = this.getArguments();
            String string2 = DATE_SELECTOR_KEY;
            this.dateSelector = dateSelector = (DateSelector)dateSelector.getParcelable(string2);
        }
        return this.dateSelector;
    }

    private static CharSequence getFirstLineBySeparator(CharSequence charSequence) {
        if (charSequence != null) {
            int n3;
            String[] stringArray = String.valueOf(charSequence);
            String string2 = "\n";
            int n4 = (stringArray = TextUtils.split((String)stringArray, (String)string2)).length;
            if (n4 > (n3 = 1)) {
                charSequence = stringArray[0];
            }
            return charSequence;
        }
        return null;
    }

    private String getHeaderContentDescription() {
        DateSelector dateSelector = this.getDateSelector();
        Context context = this.requireContext();
        return dateSelector.getSelectionContentDescription(context);
    }

    private static int getPaddedPickerWidth(Context context) {
        context = context.getResources();
        int n3 = R$dimen.mtrl_calendar_content_padding;
        n3 = context.getDimensionPixelOffset(n3);
        int n4 = Month.current().daysInWeek;
        int n7 = R$dimen.mtrl_calendar_day_width;
        n7 = context.getDimensionPixelSize(n7);
        int n8 = R$dimen.mtrl_calendar_month_horizontal_padding;
        int n10 = context.getDimensionPixelOffset(n8);
        n7 = n7 * n4 + (n3 *= 2);
        return (n4 + -1) * n10 + n7;
    }

    private int getThemeResId(Context context) {
        int n3 = this.overrideThemeResId;
        if (n3 != 0) {
            return n3;
        }
        return this.getDateSelector().getDefaultThemeResId(context);
    }

    /*
     * WARNING - void declaration
     */
    private void initHeaderToggle(Context object) {
        void var4_7;
        Object object2 = this.headerToggleButton;
        Object object3 = TOGGLE_BUTTON_TAG;
        object2.setTag(object3);
        object2 = this.headerToggleButton;
        object = MaterialDatePicker.createHeaderToggleDrawable(object);
        object2.setImageDrawable((Drawable)object);
        object = this.headerToggleButton;
        int bl2 = this.inputMode;
        if (bl2 != 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object2 = null;
        }
        object.setChecked((boolean)var4_7);
        ViewCompat.s((View)this.headerToggleButton, null);
        object = this.headerToggleButton;
        this.updateToggleContentDescription((CheckableImageButton)((Object)object));
        object = this.headerToggleButton;
        object2 = new wh1_2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    public static boolean isFullscreen(Context context) {
        return MaterialDatePicker.readMaterialCalendarStyleBoolean(context, 16843277);
    }

    private boolean isLandscape() {
        Configuration configuration = this.getResources().getConfiguration();
        int n3 = configuration.orientation;
        int n4 = 2;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            configuration = null;
        }
        return n3 != 0;
    }

    public static boolean isNestedScrollable(Context context) {
        int n3 = R$attr.nestedScrollable;
        return MaterialDatePicker.readMaterialCalendarStyleBoolean(context, n3);
    }

    private /* synthetic */ void lambda$initHeaderToggle$0(View object) {
        object = this.confirmButton;
        DateSelector dateSelector = this.getDateSelector();
        int n3 = dateSelector.isSelectionComplete();
        object.setEnabled(n3 != 0);
        object = this.headerToggleButton;
        object.toggle();
        int n4 = this.inputMode;
        n3 = 1;
        if (n4 == n3) {
            n3 = 0;
            dateSelector = null;
        }
        this.inputMode = n3;
        object = this.headerToggleButton;
        this.updateToggleContentDescription((CheckableImageButton)((Object)object));
        this.startPickerFragment();
    }

    public static MaterialDatePicker newInstance(MaterialDatePicker$Builder object) {
        MaterialDatePicker materialDatePicker = new MaterialDatePicker();
        Bundle bundle = new Bundle();
        int n3 = ((MaterialDatePicker$Builder)object).overrideThemeResId;
        bundle.putInt(OVERRIDE_THEME_RES_ID, n3);
        Object object2 = ((MaterialDatePicker$Builder)object).dateSelector;
        bundle.putParcelable(DATE_SELECTOR_KEY, (Parcelable)object2);
        object2 = ((MaterialDatePicker$Builder)object).calendarConstraints;
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, (Parcelable)object2);
        object2 = ((MaterialDatePicker$Builder)object).dayViewDecorator;
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, (Parcelable)object2);
        int n4 = ((MaterialDatePicker$Builder)object).titleTextResId;
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, n4);
        object2 = ((MaterialDatePicker$Builder)object).titleText;
        bundle.putCharSequence(TITLE_TEXT_KEY, (CharSequence)object2);
        n4 = ((MaterialDatePicker$Builder)object).inputMode;
        bundle.putInt(INPUT_MODE_KEY, n4);
        n4 = ((MaterialDatePicker$Builder)object).positiveButtonTextResId;
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, n4);
        object2 = ((MaterialDatePicker$Builder)object).positiveButtonText;
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, (CharSequence)object2);
        n4 = ((MaterialDatePicker$Builder)object).positiveButtonContentDescriptionResId;
        bundle.putInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, n4);
        object2 = ((MaterialDatePicker$Builder)object).positiveButtonContentDescription;
        bundle.putCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY, (CharSequence)object2);
        n4 = ((MaterialDatePicker$Builder)object).negativeButtonTextResId;
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, n4);
        object2 = ((MaterialDatePicker$Builder)object).negativeButtonText;
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, (CharSequence)object2);
        n4 = ((MaterialDatePicker$Builder)object).negativeButtonContentDescriptionResId;
        bundle.putInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, n4);
        object = ((MaterialDatePicker$Builder)object).negativeButtonContentDescription;
        bundle.putCharSequence(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY, (CharSequence)object);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    public static boolean readMaterialCalendarStyleBoolean(Context context, int n3) {
        int n4 = R$attr.materialCalendarStyle;
        String string2 = MaterialCalendar.class.getCanonicalName();
        n4 = MaterialAttributes.resolveOrThrow(context, n4, string2);
        int[] nArray = new int[]{n3};
        context = context.obtainStyledAttributes(n4, nArray);
        n3 = (int)(context.getBoolean(0, false) ? 1 : 0);
        context.recycle();
        return n3 != 0;
    }

    private void startPickerFragment() {
        Object object = this.requireContext();
        int n3 = this.getThemeResId((Context)object);
        Object object2 = this.getDateSelector();
        Object object3 = this.calendarConstraints;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        this.calendar = object2 = MaterialCalendar.newInstance((DateSelector)object2, n3, (CalendarConstraints)object3, dayViewDecorator);
        int n4 = this.inputMode;
        int n7 = 1;
        if (n4 == n7) {
            object2 = this.getDateSelector();
            object3 = this.calendarConstraints;
            object2 = MaterialTextInputPicker.newInstance((DateSelector)object2, n3, (CalendarConstraints)object3);
        }
        this.pickerFragment = object2;
        this.updateTitle();
        object = this.getHeaderText();
        this.updateHeader((String)object);
        object = this.getChildFragmentManager();
        object.getClass();
        object2 = new a((FragmentManager)object);
        n3 = R$id.mtrl_calendar_frame;
        object3 = this.pickerFragment;
        ((k)object2).j(n3, (Fragment)object3, null);
        ((a)object2).p();
        object = this.pickerFragment;
        object2 = new MaterialDatePicker$4(this);
        ((PickerFragment)object).addOnSelectionChangedListener((OnSelectionChangedListener)object2);
    }

    public static long thisMonthInUtcMilliseconds() {
        return Month.current().timeInMillis;
    }

    public static long todayInUtcMilliseconds() {
        return UtcDates.getTodayCalendar().getTimeInMillis();
    }

    private void updateTitle() {
        TextView textView = this.headerTitleTextView;
        int n3 = this.inputMode;
        int n4 = 1;
        CharSequence charSequence = n3 == n4 && (n3 = (int)(this.isLandscape() ? 1 : 0)) != 0 ? this.singleLineTitleText : this.fullTitleText;
        textView.setText(charSequence);
    }

    private void updateToggleContentDescription(CheckableImageButton object) {
        int n3 = this.inputMode;
        int n4 = 1;
        if (n3 == n4) {
            object = object.getContext();
            n3 = R$string.mtrl_picker_toggle_to_calendar_input_mode;
            object = object.getString(n3);
        } else {
            object = object.getContext();
            n3 = R$string.mtrl_picker_toggle_to_text_input_mode;
            object = object.getString(n3);
        }
        this.headerToggleButton.setContentDescription((CharSequence)object);
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return ((AbstractCollection)this.onCancelListeners).add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return ((AbstractCollection)this.onDismissListeners).add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return ((AbstractCollection)this.onNegativeButtonClickListeners).add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener) {
        return ((AbstractCollection)this.onPositiveButtonClickListeners).add(materialPickerOnPositiveButtonClickListener);
    }

    public void clearOnCancelListeners() {
        ((AbstractCollection)this.onCancelListeners).clear();
    }

    public void clearOnDismissListeners() {
        ((AbstractCollection)this.onDismissListeners).clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        ((AbstractCollection)this.onNegativeButtonClickListeners).clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        ((AbstractCollection)this.onPositiveButtonClickListeners).clear();
    }

    public String getHeaderText() {
        DateSelector dateSelector = this.getDateSelector();
        Context context = this.getContext();
        return dateSelector.getSelectionDisplayString(context);
    }

    public int getInputMode() {
        return this.inputMode;
    }

    public final Object getSelection() {
        return this.getDateSelector().getSelection();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        boolean bl2;
        Iterator iterator = ((AbstractCollection)this.onCancelListeners).iterator();
        while (bl2 = iterator.hasNext()) {
            DialogInterface.OnCancelListener onCancelListener = (DialogInterface.OnCancelListener)iterator.next();
            onCancelListener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle object) {
        int n3;
        super.onCreate((Bundle)object);
        if (object == null) {
            object = this.getArguments();
        }
        this.overrideThemeResId = n3 = object.getInt(OVERRIDE_THEME_RES_ID);
        Object object2 = (DateSelector)object.getParcelable(DATE_SELECTOR_KEY);
        this.dateSelector = object2;
        object2 = (CalendarConstraints)object.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.calendarConstraints = object2;
        object2 = (DayViewDecorator)object.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.dayViewDecorator = object2;
        this.titleTextResId = n3 = object.getInt(TITLE_TEXT_RES_ID_KEY);
        this.titleText = object2 = object.getCharSequence(TITLE_TEXT_KEY);
        this.inputMode = n3 = object.getInt(INPUT_MODE_KEY);
        this.positiveButtonTextResId = n3 = object.getInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY);
        this.positiveButtonText = object2 = object.getCharSequence(POSITIVE_BUTTON_TEXT_KEY);
        this.positiveButtonContentDescriptionResId = n3 = object.getInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY);
        this.positiveButtonContentDescription = object2 = object.getCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY);
        this.negativeButtonTextResId = n3 = object.getInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY);
        this.negativeButtonText = object2 = object.getCharSequence(NEGATIVE_BUTTON_TEXT_KEY);
        this.negativeButtonContentDescriptionResId = n3 = object.getInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY);
        object2 = NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY;
        object = object.getCharSequence((String)object2);
        this.negativeButtonContentDescription = object;
        object = this.titleText;
        if (object == null) {
            object = this.requireContext().getResources();
            n3 = this.titleTextResId;
            object = object.getText(n3);
        }
        this.fullTitleText = object;
        object = MaterialDatePicker.getFirstLineBySeparator((CharSequence)object);
        this.singleLineTitleText = object;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Object object = this.requireContext();
        Object object2 = this.requireContext();
        int n3 = this.getThemeResId((Context)object2);
        bundle = new Dialog((Context)object, n3);
        object = bundle.getContext();
        n3 = (int)(MaterialDatePicker.isFullscreen((Context)object) ? 1 : 0);
        this.fullscreen = n3;
        int n4 = R$attr.materialCalendarStyle;
        int n7 = R$style.Widget_MaterialComponents_MaterialCalendar;
        object2 = new MaterialShapeDrawable((Context)object, null, n4, n7);
        this.background = object2;
        object2 = R$styleable.MaterialCalendar;
        n4 = R$attr.materialCalendarStyle;
        n7 = R$style.Widget_MaterialComponents_MaterialCalendar;
        object2 = object.obtainStyledAttributes(null, (int[])object2, n4, n7);
        n4 = R$styleable.MaterialCalendar_backgroundTint;
        n4 = object2.getColor(n4, 0);
        object2.recycle();
        this.background.initializeElevationOverlay((Context)object);
        object = this.background;
        object2 = ColorStateList.valueOf((int)n4);
        ((MaterialShapeDrawable)object).setFillColor((ColorStateList)object2);
        object = this.background;
        object2 = bundle.getWindow().getDecorView();
        float f5 = ViewCompat$c.e((View)object2);
        ((MaterialShapeDrawable)object).setElevation(f5);
        return bundle;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        Object object3;
        int n3 = this.fullscreen;
        n3 = n3 != 0 ? R$layout.mtrl_picker_fullscreen : R$layout.mtrl_picker_dialog;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object);
        object = layoutInflater.getContext();
        object2 = this.dayViewDecorator;
        if (object2 != null) {
            object2.initialize((Context)object);
        }
        if ((n3 = (int)(this.fullscreen ? 1 : 0)) != 0) {
            n3 = R$id.mtrl_calendar_frame;
            object2 = layoutInflater.findViewById(n3);
            int n4 = MaterialDatePicker.getPaddedPickerWidth((Context)object);
            int n7 = -2;
            object3 = new LinearLayout.LayoutParams(n4, n7);
            object2.setLayoutParams((ViewGroup.LayoutParams)object3);
        } else {
            n3 = R$id.mtrl_calendar_main_pane;
            object2 = layoutInflater.findViewById(n3);
            int n8 = MaterialDatePicker.getPaddedPickerWidth((Context)object);
            int n10 = -1;
            object3 = new LinearLayout.LayoutParams(n8, n10);
            object2.setLayoutParams((ViewGroup.LayoutParams)object3);
        }
        n3 = R$id.mtrl_picker_header_selection_text;
        object2 = (TextView)layoutInflater.findViewById(n3);
        this.headerSelectionText = object2;
        object3 = ViewCompat.a;
        int n14 = 1;
        object2.setAccessibilityLiveRegion(n14);
        n3 = R$id.mtrl_picker_header_toggle;
        object2 = (CheckableImageButton)layoutInflater.findViewById(n3);
        this.headerToggleButton = object2;
        n3 = R$id.mtrl_picker_title_text;
        object2 = (TextView)layoutInflater.findViewById(n3);
        this.headerTitleTextView = object2;
        this.initHeaderToggle((Context)object);
        int n15 = R$id.confirm_button;
        object = (Button)layoutInflater.findViewById(n15);
        this.confirmButton = object;
        object = this.getDateSelector();
        n15 = (int)(object.isSelectionComplete() ? 1 : 0);
        if (n15 != 0) {
            object = this.confirmButton;
            object.setEnabled(n14 != 0);
        } else {
            object = this.confirmButton;
            n3 = 0;
            object2 = null;
            object.setEnabled(false);
        }
        object = this.confirmButton;
        object2 = CONFIRM_BUTTON_TAG;
        object.setTag(object2);
        object = this.positiveButtonText;
        if (object != null) {
            object2 = this.confirmButton;
            object2.setText((CharSequence)object);
        } else {
            n15 = this.positiveButtonTextResId;
            if (n15 != 0) {
                object2 = this.confirmButton;
                object2.setText(n15);
            }
        }
        object = this.positiveButtonContentDescription;
        if (object != null) {
            object2 = this.confirmButton;
            object2.setContentDescription((CharSequence)object);
        } else {
            n15 = this.positiveButtonContentDescriptionResId;
            if (n15 != 0) {
                object = this.confirmButton;
                object2 = this.getContext().getResources();
                n14 = this.positiveButtonContentDescriptionResId;
                object2 = object2.getText(n14);
                object.setContentDescription((CharSequence)object2);
            }
        }
        object = this.confirmButton;
        object2 = new MaterialDatePicker$1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        n15 = R$id.cancel_button;
        object = (Button)layoutInflater.findViewById(n15);
        object2 = CANCEL_BUTTON_TAG;
        object.setTag(object2);
        object2 = this.negativeButtonText;
        if (object2 != null) {
            object.setText((CharSequence)object2);
        } else {
            n3 = this.negativeButtonTextResId;
            if (n3 != 0) {
                object.setText(n3);
            }
        }
        object2 = this.negativeButtonContentDescription;
        if (object2 != null) {
            object.setContentDescription((CharSequence)object2);
        } else {
            n3 = this.negativeButtonContentDescriptionResId;
            if (n3 != 0) {
                object2 = this.getContext().getResources();
                n14 = this.negativeButtonContentDescriptionResId;
                object2 = object2.getText(n14);
                object.setContentDescription((CharSequence)object2);
            }
        }
        object2 = new MaterialDatePicker$2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        return layoutInflater;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean bl2;
        ViewGroup viewGroup = ((AbstractCollection)this.onDismissListeners).iterator();
        while (bl2 = viewGroup.hasNext()) {
            DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener)viewGroup.next();
            onDismissListener.onDismiss(dialogInterface);
        }
        viewGroup = (ViewGroup)this.getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int n3 = this.overrideThemeResId;
        bundle.putInt(OVERRIDE_THEME_RES_ID, n3);
        Object object = this.dateSelector;
        bundle.putParcelable(DATE_SELECTOR_KEY, (Parcelable)object);
        object = this.calendarConstraints;
        Object object2 = new CalendarConstraints$Builder((CalendarConstraints)object);
        object = this.calendar;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            object = ((MaterialCalendar)object).getCurrentMonth();
        }
        if (object != null) {
            long l2 = ((Month)object).timeInMillis;
            ((CalendarConstraints$Builder)object2).setOpenAt(l2);
        }
        object2 = ((CalendarConstraints$Builder)object2).build();
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, (Parcelable)object2);
        object = this.dayViewDecorator;
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, (Parcelable)object);
        n3 = this.titleTextResId;
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, n3);
        object = this.titleText;
        bundle.putCharSequence(TITLE_TEXT_KEY, (CharSequence)object);
        n3 = this.inputMode;
        bundle.putInt(INPUT_MODE_KEY, n3);
        n3 = this.positiveButtonTextResId;
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, n3);
        object = this.positiveButtonText;
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, (CharSequence)object);
        n3 = this.positiveButtonContentDescriptionResId;
        bundle.putInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, n3);
        object = this.positiveButtonContentDescription;
        bundle.putCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY, (CharSequence)object);
        n3 = this.negativeButtonTextResId;
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, n3);
        object = this.negativeButtonText;
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, (CharSequence)object);
        n3 = this.negativeButtonContentDescriptionResId;
        bundle.putInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, n3);
        object = this.negativeButtonContentDescription;
        bundle.putCharSequence(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY, (CharSequence)object);
    }

    public void onStart() {
        super.onStart();
        Window window = this.requireDialog().getWindow();
        int n3 = this.fullscreen;
        if (n3 != 0) {
            n3 = -1;
            window.setLayout(n3, n3);
            MaterialShapeDrawable materialShapeDrawable = this.background;
            window.setBackgroundDrawable((Drawable)materialShapeDrawable);
            this.enableEdgeToEdgeIfNeeded(window);
        } else {
            Object object;
            n3 = -2;
            window.setLayout(n3, n3);
            Resources resources = this.getResources();
            int n4 = R$dimen.mtrl_calendar_dialog_background_inset;
            int n7 = resources.getDimensionPixelOffset(n4);
            resources = new Rect(n7, n7, n7, n7);
            MaterialShapeDrawable materialShapeDrawable = this.background;
            InsetDrawable insetDrawable = object;
            object = new InsetDrawable((Drawable)materialShapeDrawable, n7, n7, n7, n7);
            window.setBackgroundDrawable((Drawable)object);
            window = window.getDecorView();
            insetDrawable = this.requireDialog();
            object = new InsetDialogOnTouchListener((Dialog)insetDrawable, (Rect)resources);
            window.setOnTouchListener((View.OnTouchListener)object);
        }
        this.startPickerFragment();
    }

    public void onStop() {
        this.pickerFragment.clearOnSelectionChangedListeners();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return ((AbstractCollection)this.onCancelListeners).remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return ((AbstractCollection)this.onDismissListeners).remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return ((AbstractCollection)this.onNegativeButtonClickListeners).remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener materialPickerOnPositiveButtonClickListener) {
        return ((AbstractCollection)this.onPositiveButtonClickListeners).remove(materialPickerOnPositiveButtonClickListener);
    }

    public void updateHeader(String string2) {
        TextView textView = this.headerSelectionText;
        String string3 = this.getHeaderContentDescription();
        textView.setContentDescription((CharSequence)string3);
        this.headerSelectionText.setText((CharSequence)string2);
    }
}

