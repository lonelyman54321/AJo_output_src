/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.ContextThemeWrapper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.GridView
 *  android.widget.ListAdapter
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.recyclerview.widget.y;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CalendarStyle;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.DayViewDecorator;
import com.google.android.material.datepicker.DaysOfWeekAdapter;
import com.google.android.material.datepicker.MaterialCalendar$1;
import com.google.android.material.datepicker.MaterialCalendar$10;
import com.google.android.material.datepicker.MaterialCalendar$11;
import com.google.android.material.datepicker.MaterialCalendar$2;
import com.google.android.material.datepicker.MaterialCalendar$3;
import com.google.android.material.datepicker.MaterialCalendar$4;
import com.google.android.material.datepicker.MaterialCalendar$5;
import com.google.android.material.datepicker.MaterialCalendar$6;
import com.google.android.material.datepicker.MaterialCalendar$7;
import com.google.android.material.datepicker.MaterialCalendar$8;
import com.google.android.material.datepicker.MaterialCalendar$9;
import com.google.android.material.datepicker.MaterialCalendar$CalendarSelector;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import com.google.android.material.datepicker.MonthAdapter;
import com.google.android.material.datepicker.MonthsPagerAdapter;
import com.google.android.material.datepicker.OnSelectionChangedListener;
import com.google.android.material.datepicker.PickerFragment;
import com.google.android.material.datepicker.YearGridAdapter;

public final class MaterialCalendar
extends PickerFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    static final Object NAVIGATION_NEXT_TAG;
    static final Object NAVIGATION_PREV_TAG;
    static final Object SELECTOR_TOGGLE_TAG;
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private CalendarConstraints calendarConstraints;
    private MaterialCalendar$CalendarSelector calendarSelector;
    private CalendarStyle calendarStyle;
    private Month current;
    private DateSelector dateSelector;
    private View dayFrame;
    private DayViewDecorator dayViewDecorator;
    private View monthNext;
    private View monthPrev;
    private RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;

    static {
        NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
        NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
        SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";
    }

    public static /* synthetic */ RecyclerView access$000(MaterialCalendar materialCalendar) {
        return materialCalendar.recyclerView;
    }

    public static /* synthetic */ CalendarConstraints access$100(MaterialCalendar materialCalendar) {
        return materialCalendar.calendarConstraints;
    }

    public static /* synthetic */ DateSelector access$200(MaterialCalendar materialCalendar) {
        return materialCalendar.dateSelector;
    }

    public static /* synthetic */ RecyclerView access$300(MaterialCalendar materialCalendar) {
        return materialCalendar.yearSelector;
    }

    public static /* synthetic */ CalendarStyle access$400(MaterialCalendar materialCalendar) {
        return materialCalendar.calendarStyle;
    }

    public static /* synthetic */ View access$500(MaterialCalendar materialCalendar) {
        return materialCalendar.dayFrame;
    }

    public static /* synthetic */ Month access$602(MaterialCalendar materialCalendar, Month month) {
        materialCalendar.current = month;
        return month;
    }

    private void addActionsToMonthNavigation(View object, MonthsPagerAdapter monthsPagerAdapter) {
        int n3 = R$id.month_navigation_fragment_toggle;
        Object object2 = (MaterialButton)object.findViewById(n3);
        Object object3 = SELECTOR_TOGGLE_TAG;
        object2.setTag(object3);
        object3 = new MaterialCalendar$6(this);
        ViewCompat.s((View)object2, (a)object3);
        int n4 = R$id.month_navigation_previous;
        object3 = object.findViewById(n4);
        this.monthPrev = object3;
        Object object4 = NAVIGATION_PREV_TAG;
        object3.setTag(object4);
        n4 = R$id.month_navigation_next;
        object3 = object.findViewById(n4);
        this.monthNext = object3;
        object4 = NAVIGATION_NEXT_TAG;
        object3.setTag(object4);
        n4 = R$id.mtrl_calendar_year_selector_frame;
        object3 = object.findViewById(n4);
        this.yearFrame = object3;
        n4 = R$id.mtrl_calendar_day_selector_frame;
        object = object.findViewById(n4);
        this.dayFrame = object;
        object = MaterialCalendar$CalendarSelector.DAY;
        this.setSelector((MaterialCalendar$CalendarSelector)((Object)object));
        object = this.current.getLongName();
        object2.setText((CharSequence)object);
        object = this.recyclerView;
        object3 = new MaterialCalendar$7(this, monthsPagerAdapter, (MaterialButton)object2);
        ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object3);
        object = new MaterialCalendar$8(this);
        object2.setOnClickListener((View.OnClickListener)object);
        object = this.monthNext;
        object2 = new MaterialCalendar$9(this, monthsPagerAdapter);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.monthPrev;
        object2 = new MaterialCalendar$10(this, monthsPagerAdapter);
        object.setOnClickListener((View.OnClickListener)object2);
    }

    private RecyclerView$n createItemDecoration() {
        MaterialCalendar$5 materialCalendar$5 = new MaterialCalendar$5(this);
        return materialCalendar$5;
    }

    public static int getDayHeight(Context context) {
        context = context.getResources();
        int n3 = R$dimen.mtrl_calendar_day_height;
        return context.getDimensionPixelSize(n3);
    }

    private static int getDialogPickerHeight(Context context) {
        context = context.getResources();
        int n3 = R$dimen.mtrl_calendar_navigation_height;
        n3 = context.getDimensionPixelSize(n3);
        int n4 = R$dimen.mtrl_calendar_navigation_top_padding;
        n4 = context.getDimensionPixelOffset(n4) + n3;
        n3 = R$dimen.mtrl_calendar_navigation_bottom_padding;
        n3 = context.getDimensionPixelOffset(n3) + n4;
        n4 = R$dimen.mtrl_calendar_days_of_week_height;
        n4 = context.getDimensionPixelSize(n4);
        int n7 = MonthAdapter.MAXIMUM_WEEKS;
        int n8 = R$dimen.mtrl_calendar_day_height;
        n8 = context.getDimensionPixelSize(n8) * n7;
        int n10 = R$dimen.mtrl_calendar_month_vertical_padding;
        n10 = context.getDimensionPixelOffset(n10) * (n7 += -1) + n8;
        n7 = R$dimen.mtrl_calendar_bottom_padding;
        int n14 = context.getDimensionPixelOffset(n7);
        return n3 + n4 + n10 + n14;
    }

    public static MaterialCalendar newInstance(DateSelector dateSelector, int n3, CalendarConstraints calendarConstraints) {
        return MaterialCalendar.newInstance(dateSelector, n3, calendarConstraints, null);
    }

    public static MaterialCalendar newInstance(DateSelector dateSelector, int n3, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, n3);
        bundle.putParcelable(GRID_SELECTOR_KEY, (Parcelable)dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, (Parcelable)calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, (Parcelable)dayViewDecorator);
        Month month = calendarConstraints.getOpenAt();
        bundle.putParcelable(CURRENT_MONTH_KEY, (Parcelable)month);
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void postSmoothRecyclerViewScroll(int n3) {
        RecyclerView recyclerView = this.recyclerView;
        MaterialCalendar$11 materialCalendar$11 = new MaterialCalendar$11(this, n3);
        recyclerView.post(materialCalendar$11);
    }

    private void setUpForAccessibility() {
        RecyclerView recyclerView = this.recyclerView;
        MaterialCalendar$4 materialCalendar$4 = new MaterialCalendar$4(this);
        ViewCompat.s((View)recyclerView, materialCalendar$4);
    }

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    public Month getCurrentMonth() {
        return this.current;
    }

    public DateSelector getDateSelector() {
        return this.dateSelector;
    }

    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager)this.recyclerView.getLayoutManager();
    }

    public void onCreate(Bundle object) {
        Object object2;
        int n3;
        super.onCreate((Bundle)object);
        if (object == null) {
            object = this.getArguments();
        }
        this.themeResId = n3 = object.getInt(THEME_RES_ID_KEY);
        this.dateSelector = object2 = (DateSelector)object.getParcelable(GRID_SELECTOR_KEY);
        object2 = (CalendarConstraints)object.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.calendarConstraints = object2;
        object2 = (DayViewDecorator)object.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.dayViewDecorator = object2;
        object = (Month)object.getParcelable(CURRENT_MONTH_KEY);
        this.current = object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object object;
        MaterialCalendar$3 materialCalendar$3;
        int n3;
        Object object2 = this.getContext();
        int n4 = this.themeResId;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context)object2, n4);
        object2 = new CalendarStyle((Context)contextThemeWrapper);
        this.calendarStyle = object2;
        object2 = layoutInflater.cloneInContext((Context)contextThemeWrapper);
        Object object3 = this.calendarConstraints.getStart();
        int n7 = MaterialDatePicker.isFullscreen((Context)contextThemeWrapper);
        int n8 = 1;
        if (n7 != 0) {
            n7 = R$layout.mtrl_calendar_vertical;
            n3 = 1;
        } else {
            n7 = R$layout.mtrl_calendar_horizontal;
            n3 = 0;
            materialCalendar$3 = null;
        }
        View view = object2.inflate(n7, viewGroup, false);
        int n10 = MaterialCalendar.getDialogPickerHeight(this.requireContext());
        view.setMinimumHeight(n10);
        n10 = R$id.mtrl_calendar_days_of_week;
        object2 = (GridView)view.findViewById(n10);
        Object object4 = new MaterialCalendar$1(this);
        ViewCompat.s((View)object2, (a)object4);
        object4 = this.calendarConstraints;
        n7 = ((CalendarConstraints)object4).getFirstDayOfWeek();
        Object object5 = n7 > 0 ? new DaysOfWeekAdapter(n7) : new DaysOfWeekAdapter();
        object2.setAdapter((ListAdapter)object5);
        n4 = ((Month)object3).daysInWeek;
        object2.setNumColumns(n4);
        object2.setEnabled(false);
        n10 = R$id.mtrl_calendar_months;
        object2 = (RecyclerView)view.findViewById(n10);
        this.recyclerView = object2;
        object4 = this.getContext();
        object2 = object;
        object3 = this;
        object = new MaterialCalendar$2(this, (Context)object4, n3, false, n3);
        this.recyclerView.setLayoutManager((RecyclerView$o)object);
        object2 = this.recyclerView;
        object3 = MONTHS_VIEW_GROUP_TAG;
        object2.setTag(object3);
        object4 = this.dateSelector;
        object5 = this.calendarConstraints;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        materialCalendar$3 = new MaterialCalendar$3(this);
        object2 = object;
        object3 = contextThemeWrapper;
        object = new MonthsPagerAdapter((Context)contextThemeWrapper, (DateSelector)object4, (CalendarConstraints)object5, dayViewDecorator, materialCalendar$3);
        this.recyclerView.setAdapter((RecyclerView$f)object);
        object2 = contextThemeWrapper.getResources();
        n4 = R$integer.mtrl_calendar_year_selector_span;
        n10 = object2.getInteger(n4);
        n4 = R$id.mtrl_calendar_year_selector_frame;
        this.yearSelector = object3 = (RecyclerView)view.findViewById(n4);
        if (object3 != null) {
            ((RecyclerView)object3).setHasFixedSize(n8 != 0);
            object3 = this.yearSelector;
            object4 = new GridLayoutManager((Context)contextThemeWrapper, n10, n8, false);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object4);
            object2 = this.yearSelector;
            object3 = new YearGridAdapter(this);
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object3);
            object2 = this.yearSelector;
            object3 = this.createItemDecoration();
            ((RecyclerView)object2).addItemDecoration((RecyclerView$n)object3);
        }
        if ((object2 = view.findViewById(n10 = R$id.month_navigation_fragment_toggle)) != null) {
            this.addActionsToMonthNavigation(view, (MonthsPagerAdapter)object);
        }
        if ((n10 = (int)(MaterialDatePicker.isFullscreen((Context)contextThemeWrapper) ? 1 : 0)) == 0) {
            object2 = new y();
            object3 = this.recyclerView;
            ((y)object2).attachToRecyclerView((RecyclerView)object3);
        }
        object2 = this.recyclerView;
        object3 = this.current;
        n4 = ((MonthsPagerAdapter)object).getPosition((Month)object3);
        ((RecyclerView)object2).scrollToPosition(n4);
        this.setUpForAccessibility();
        return view;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int n3 = this.themeResId;
        bundle.putInt(THEME_RES_ID_KEY, n3);
        Object object = this.dateSelector;
        bundle.putParcelable(GRID_SELECTOR_KEY, (Parcelable)object);
        object = this.calendarConstraints;
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, (Parcelable)object);
        object = this.dayViewDecorator;
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, (Parcelable)object);
        object = this.current;
        bundle.putParcelable(CURRENT_MONTH_KEY, (Parcelable)object);
    }

    public void setCurrentMonth(Month object) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter)this.recyclerView.getAdapter();
        int n3 = monthsPagerAdapter.getPosition((Month)object);
        Month month = this.current;
        int n4 = monthsPagerAdapter.getPosition(month);
        n4 = n3 - n4;
        int n7 = Math.abs(n4);
        int n8 = 3;
        boolean bl2 = false;
        if (n7 > n8) {
            n7 = 1;
        } else {
            n7 = 0;
            month = null;
        }
        if (n4 > 0) {
            bl2 = true;
        }
        this.current = object;
        if (n7 != 0 && bl2) {
            object = this.recyclerView;
            n4 = n3 + -3;
            ((RecyclerView)object).scrollToPosition(n4);
            this.postSmoothRecyclerViewScroll(n3);
        } else if (n7 != 0) {
            object = this.recyclerView;
            n4 = n3 + 3;
            ((RecyclerView)object).scrollToPosition(n4);
            this.postSmoothRecyclerViewScroll(n3);
        } else {
            this.postSmoothRecyclerViewScroll(n3);
        }
    }

    public void setSelector(MaterialCalendar$CalendarSelector object) {
        this.calendarSelector = object;
        Object object2 = MaterialCalendar$CalendarSelector.YEAR;
        int n3 = 8;
        if (object == object2) {
            object = this.yearSelector.getLayoutManager();
            object2 = (YearGridAdapter)this.yearSelector.getAdapter();
            Month month = this.current;
            int n4 = month.year;
            int n7 = ((YearGridAdapter)object2).getPositionForYear(n4);
            ((RecyclerView$o)object).scrollToPosition(n7);
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(n3);
            this.monthPrev.setVisibility(n3);
            object = this.monthNext;
            object.setVisibility(n3);
        } else {
            object2 = MaterialCalendar$CalendarSelector.DAY;
            if (object == object2) {
                this.yearFrame.setVisibility(n3);
                this.dayFrame.setVisibility(0);
                this.monthPrev.setVisibility(0);
                this.monthNext.setVisibility(0);
                object = this.current;
                this.setCurrentMonth((Month)object);
            }
        }
    }

    public void toggleVisibleSelector() {
        MaterialCalendar$CalendarSelector materialCalendar$CalendarSelector = this.calendarSelector;
        MaterialCalendar$CalendarSelector materialCalendar$CalendarSelector2 = MaterialCalendar$CalendarSelector.YEAR;
        if (materialCalendar$CalendarSelector == materialCalendar$CalendarSelector2) {
            materialCalendar$CalendarSelector = MaterialCalendar$CalendarSelector.DAY;
            this.setSelector(materialCalendar$CalendarSelector);
        } else {
            MaterialCalendar$CalendarSelector materialCalendar$CalendarSelector3 = MaterialCalendar$CalendarSelector.DAY;
            if (materialCalendar$CalendarSelector == materialCalendar$CalendarSelector3) {
                this.setSelector(materialCalendar$CalendarSelector2);
            }
        }
    }
}

