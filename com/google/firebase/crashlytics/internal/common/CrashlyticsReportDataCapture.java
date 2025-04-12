/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  android.text.TextUtils
 */
package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BatteryState;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder;
import com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CrashlyticsReportDataCapture {
    private static final Map ARCHITECTURES_BY_NAME;
    static final String GENERATOR;
    static final int GENERATOR_TYPE = 3;
    static final int REPORT_ANDROID_PLATFORM = 4;
    static final int SESSION_ANDROID_PLATFORM = 3;
    static final String SIGNAL_DEFAULT = "0";
    private final AppData appData;
    private final Context context;
    private final IdManager idManager;
    private final ProcessDetailsProvider processDetailsProvider;
    private final SettingsProvider settingsProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;

    static {
        Cloneable cloneable;
        ARCHITECTURES_BY_NAME = cloneable = new Cloneable();
        ro.a(5, cloneable, "armeabi", 6, "armeabi-v7a");
        ro.a(9, cloneable, "arm64-v8a", 0, "x86");
        Integer n3 = 1;
        cloneable.put("x86_64", n3);
        cloneable = Locale.US;
        GENERATOR = "Crashlytics Android SDK/19.4.0";
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider) {
        ProcessDetailsProvider processDetailsProvider;
        this.processDetailsProvider = processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        this.context = context;
        this.idManager = idManager;
        this.appData = appData;
        this.stackTraceTrimmingStrategy = stackTraceTrimmingStrategy;
        this.settingsProvider = settingsProvider;
    }

    private CrashlyticsReport$ApplicationExitInfo addBuildIdInfo(CrashlyticsReport$ApplicationExitInfo object) {
        Object object2;
        int n3;
        Object object3;
        List<Object> list = this.settingsProvider.getSettingsSync().featureFlagData;
        int n4 = ((Settings$FeatureFlagData)((Object)list)).collectBuildIds;
        if (n4 != 0 && (n4 = (list = this.appData.buildIdInfoList).size()) > 0) {
            list = new List<Object>();
            object3 = this.appData.buildIdInfoList.iterator();
            while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object2 = (BuildIdInfo)object3.next();
                CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder = CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch.builder();
                String string2 = ((BuildIdInfo)object2).getLibraryName();
                crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder = crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.setLibraryName(string2);
                string2 = ((BuildIdInfo)object2).getArch();
                crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder = crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.setArch(string2);
                object2 = ((BuildIdInfo)object2).getBuildId();
                object2 = crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.setBuildId((String)object2).build();
                ((ArrayList)list).add(object2);
            }
            list = Collections.unmodifiableList(list);
        } else {
            n4 = 0;
            list = null;
        }
        object3 = CrashlyticsReport$ApplicationExitInfo.builder();
        n3 = ((CrashlyticsReport$ApplicationExitInfo)object).getImportance();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setImportance(n3);
        object2 = ((CrashlyticsReport$ApplicationExitInfo)object).getProcessName();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setProcessName((String)object2);
        n3 = ((CrashlyticsReport$ApplicationExitInfo)object).getReasonCode();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setReasonCode(n3);
        long l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getTimestamp();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setTimestamp(l2);
        n3 = ((CrashlyticsReport$ApplicationExitInfo)object).getPid();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setPid(n3);
        l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getPss();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setPss(l2);
        l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getRss();
        object3 = ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setRss(l2);
        object = ((CrashlyticsReport$ApplicationExitInfo)object).getTraceFile();
        return ((CrashlyticsReport$ApplicationExitInfo$Builder)object3).setTraceFile((String)object).setBuildIdMappingForArch(list).build();
    }

    private CrashlyticsReport$Builder buildReportData() {
        CrashlyticsReport$Builder crashlyticsReport$Builder = CrashlyticsReport.builder().setSdkVersion("19.4.0");
        String string2 = this.appData.googleAppId;
        crashlyticsReport$Builder = crashlyticsReport$Builder.setGmpAppId(string2);
        string2 = this.idManager.getInstallIds().getCrashlyticsInstallId();
        crashlyticsReport$Builder = crashlyticsReport$Builder.setInstallationUuid(string2);
        string2 = this.idManager.getInstallIds().getFirebaseInstallationId();
        crashlyticsReport$Builder = crashlyticsReport$Builder.setFirebaseInstallationId(string2);
        string2 = this.idManager.getInstallIds().getFirebaseAuthenticationToken();
        crashlyticsReport$Builder = crashlyticsReport$Builder.setFirebaseAuthenticationToken(string2);
        string2 = this.appData.versionCode;
        crashlyticsReport$Builder = crashlyticsReport$Builder.setBuildVersion(string2);
        string2 = this.appData.versionName;
        return crashlyticsReport$Builder.setDisplayVersion(string2).setPlatform(4);
    }

    private static long ensureNonNegative(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0) {
            l2 = l3;
        }
        return l2;
    }

    private static int getDeviceArchitecture() {
        Object object = Build.CPU_ABI;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        int n3 = 7;
        if (bl2) {
            return n3;
        }
        Map map2 = ARCHITECTURES_BY_NAME;
        Locale locale = Locale.US;
        object = ((String)object).toLowerCase(locale);
        if ((object = (Integer)map2.get(object)) == null) {
            return n3;
        }
        return (Integer)object;
    }

    private CrashlyticsReport$Session$Event$Application$Execution$BinaryImage populateBinaryImageData() {
        CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder = CrashlyticsReport$Session$Event$Application$Execution$BinaryImage.builder();
        long l2 = 0L;
        crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder = crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setBaseAddress(l2).setSize(l2);
        String string2 = this.appData.packageName;
        crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder = crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setName(string2);
        string2 = this.appData.buildId;
        return crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setUuid(string2).build();
    }

    private List populateBinaryImagesList() {
        return Collections.singletonList(this.populateBinaryImageData());
    }

    private CrashlyticsReport$Session$Event$Application populateEventApplicationData(int n3, CrashlyticsReport$ApplicationExitInfo object) {
        Object object2;
        int n4;
        int n7 = ((CrashlyticsReport$ApplicationExitInfo)object).getImportance();
        if (n7 != (n4 = 100)) {
            n7 = 1;
        } else {
            n7 = 0;
            object2 = null;
        }
        Object object3 = CrashlyticsReport$Session$Event$Application.builder();
        object2 = n7 != 0;
        object2 = ((CrashlyticsReport$Session$Event$Application$Builder)object3).setBackground((Boolean)object2);
        object3 = this.processDetailsFromApplicationExitInfo((CrashlyticsReport$ApplicationExitInfo)object);
        CrashlyticsReport$Session$Event$Application$Builder crashlyticsReport$Session$Event$Application$Builder = ((CrashlyticsReport$Session$Event$Application$Builder)object2).setCurrentProcessDetails((CrashlyticsReport$Session$Event$Application$ProcessDetails)object3).setUiOrientation(n3);
        object = this.populateExecutionData((CrashlyticsReport$ApplicationExitInfo)object);
        return crashlyticsReport$Session$Event$Application$Builder.setExecution((CrashlyticsReport$Session$Event$Application$Execution)object).build();
    }

    private CrashlyticsReport$Session$Event$Application populateEventApplicationData(int n3, TrimmedThrowableData object, Thread thread2, int n4, int n7, boolean bl2) {
        Object object2 = this.processDetailsProvider;
        Object object3 = this.context;
        int n8 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)(object2 = ((ProcessDetailsProvider)object2).getCurrentProcessDetails((Context)object3))).getImportance();
        if (n8 > 0) {
            int n10;
            n8 = ((CrashlyticsReport$Session$Event$Application$ProcessDetails)object2).getImportance();
            if (n8 != (n10 = 100)) {
                n8 = 1;
            } else {
                n8 = 0;
                object3 = null;
            }
            object3 = n8 != 0;
        } else {
            n8 = 0;
            object3 = null;
        }
        object2 = CrashlyticsReport$Session$Event$Application.builder().setBackground((Boolean)object3).setCurrentProcessDetails((CrashlyticsReport$Session$Event$Application$ProcessDetails)object2);
        object3 = this.processDetailsProvider;
        Object object4 = this.context;
        object3 = ((ProcessDetailsProvider)object3).getAppProcessDetails((Context)object4);
        CrashlyticsReport$Session$Event$Application$Builder crashlyticsReport$Session$Event$Application$Builder = ((CrashlyticsReport$Session$Event$Application$Builder)object2).setAppProcessDetails((List)object3).setUiOrientation(n3);
        object2 = this;
        object3 = object;
        object4 = thread2;
        object = this.populateExecutionData((TrimmedThrowableData)object, thread2, n4, n7, bl2);
        return crashlyticsReport$Session$Event$Application$Builder.setExecution((CrashlyticsReport$Session$Event$Application$Execution)object).build();
    }

    private CrashlyticsReport$Session$Event$Device populateEventDeviceData(int n3) {
        BatteryState batteryState = BatteryState.get(this.context);
        Number number = batteryState.getBatteryLevel();
        if (number != null) {
            double d2 = number.doubleValue();
            number = d2;
        } else {
            number = null;
        }
        int n4 = batteryState.getBatteryVelocity();
        boolean bl2 = CommonUtils.getProximitySensorEnabled(this.context);
        long l2 = CommonUtils.calculateTotalRamInBytes(this.context);
        long l3 = CommonUtils.calculateFreeRamInBytes(this.context);
        l2 = CrashlyticsReportDataCapture.ensureNonNegative(l2 - l3);
        l3 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
        return CrashlyticsReport$Session$Event$Device.builder().setBatteryLevel((Double)number).setBatteryVelocity(n4).setProximityOn(bl2).setOrientation(n3).setRamUsed(l2).setDiskUsed(l3).build();
    }

    private CrashlyticsReport$Session$Event$Application$Execution$Exception populateExceptionData(TrimmedThrowableData trimmedThrowableData, int n3, int n4) {
        return this.populateExceptionData(trimmedThrowableData, n3, n4, 0);
    }

    private CrashlyticsReport$Session$Event$Application$Execution$Exception populateExceptionData(TrimmedThrowableData object, int n3, int n4, int n7) {
        Object object2;
        Object object3 = ((TrimmedThrowableData)object).className;
        Object object4 = ((TrimmedThrowableData)object).localizedMessage;
        StackTraceElement[] stackTraceElementArray = ((TrimmedThrowableData)object).stacktrace;
        int n8 = 0;
        if (stackTraceElementArray == null) {
            stackTraceElementArray = new StackTraceElement[]{};
        }
        object = ((TrimmedThrowableData)object).cause;
        if (n7 >= n4) {
            object2 = object;
            while (object2 != null) {
                object2 = ((TrimmedThrowableData)object2).cause;
                ++n8;
            }
        }
        object2 = CrashlyticsReport$Session$Event$Application$Execution$Exception.builder();
        object3 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder)object2).setType((String)object3).setReason((String)object4);
        object4 = this.populateFramesList(stackTraceElementArray, n3);
        object3 = ((CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder)object3).setFrames((List)object4).setOverflowCount(n8);
        if (object != null && n8 == 0) {
            object = this.populateExceptionData((TrimmedThrowableData)object, n3, n4, ++n7);
            ((CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder)object3).setCausedBy((CrashlyticsReport$Session$Event$Application$Execution$Exception)object);
        }
        return ((CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder)object3).build();
    }

    private CrashlyticsReport$Session$Event$Application$Execution populateExecutionData(CrashlyticsReport$ApplicationExitInfo object) {
        object = CrashlyticsReport$Session$Event$Application$Execution.builder().setAppExitInfo((CrashlyticsReport$ApplicationExitInfo)object);
        Object object2 = this.populateSignalData();
        object = ((CrashlyticsReport$Session$Event$Application$Execution$Builder)object).setSignal((CrashlyticsReport$Session$Event$Application$Execution$Signal)object2);
        object2 = this.populateBinaryImagesList();
        return ((CrashlyticsReport$Session$Event$Application$Execution$Builder)object).setBinaries((List)object2).build();
    }

    private CrashlyticsReport$Session$Event$Application$Execution populateExecutionData(TrimmedThrowableData object, Thread object2, int n3, int n4, boolean bl2) {
        CrashlyticsReport$Session$Event$Application$Execution$Builder crashlyticsReport$Session$Event$Application$Execution$Builder = CrashlyticsReport$Session$Event$Application$Execution.builder();
        object2 = this.populateThreadsList((TrimmedThrowableData)object, (Thread)object2, n3, bl2);
        object2 = crashlyticsReport$Session$Event$Application$Execution$Builder.setThreads((List)object2);
        object = this.populateExceptionData((TrimmedThrowableData)object, n3, n4);
        object = ((CrashlyticsReport$Session$Event$Application$Execution$Builder)object2).setException((CrashlyticsReport$Session$Event$Application$Execution$Exception)object);
        object2 = this.populateSignalData();
        object = ((CrashlyticsReport$Session$Event$Application$Execution$Builder)object).setSignal((CrashlyticsReport$Session$Event$Application$Execution$Signal)object2);
        object2 = this.populateBinaryImagesList();
        return ((CrashlyticsReport$Session$Event$Application$Execution$Builder)object).setBinaries((List)object2).build();
    }

    private CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame populateFrameData(StackTraceElement stackTraceElement, CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder) {
        long l2;
        int n3 = stackTraceElement.isNativeMethod();
        long l3 = 0L;
        if (n3 != 0) {
            n3 = stackTraceElement.getLineNumber();
            l2 = Math.max((long)n3, l3);
        } else {
            l2 = l3;
        }
        CharSequence charSequence = new StringBuilder();
        String string2 = stackTraceElement.getClassName();
        charSequence.append(string2);
        charSequence.append(".");
        string2 = stackTraceElement.getMethodName();
        charSequence.append(string2);
        charSequence = charSequence.toString();
        string2 = stackTraceElement.getFileName();
        int n4 = stackTraceElement.isNativeMethod();
        if (n4 == 0 && (n4 = stackTraceElement.getLineNumber()) > 0) {
            int n7 = stackTraceElement.getLineNumber();
            l3 = n7;
        }
        return crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.setPc(l2).setSymbol((String)charSequence).setFile(string2).setOffset(l3).build();
    }

    private List populateFramesList(StackTraceElement[] stackTraceElementArray, int n3) {
        ArrayList<CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame> arrayList = new ArrayList<CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame>();
        for (StackTraceElement stackTraceElement : stackTraceElementArray) {
            CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder = CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame.builder().setImportance(n3);
            CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame object = this.populateFrameData(stackTraceElement, crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder);
            arrayList.add(object);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private CrashlyticsReport$Session$Application populateSessionApplicationData() {
        CrashlyticsReport$Session$Application$Builder crashlyticsReport$Session$Application$Builder = CrashlyticsReport$Session$Application.builder();
        String string2 = this.idManager.getAppIdentifier();
        crashlyticsReport$Session$Application$Builder = crashlyticsReport$Session$Application$Builder.setIdentifier(string2);
        string2 = this.appData.versionCode;
        crashlyticsReport$Session$Application$Builder = crashlyticsReport$Session$Application$Builder.setVersion(string2);
        string2 = this.appData.versionName;
        crashlyticsReport$Session$Application$Builder = crashlyticsReport$Session$Application$Builder.setDisplayVersion(string2);
        string2 = this.idManager.getInstallIds().getCrashlyticsInstallId();
        crashlyticsReport$Session$Application$Builder = crashlyticsReport$Session$Application$Builder.setInstallationUuid(string2);
        string2 = this.appData.developmentPlatformProvider.getDevelopmentPlatform();
        crashlyticsReport$Session$Application$Builder = crashlyticsReport$Session$Application$Builder.setDevelopmentPlatform(string2);
        string2 = this.appData.developmentPlatformProvider.getDevelopmentPlatformVersion();
        return crashlyticsReport$Session$Application$Builder.setDevelopmentPlatformVersion(string2).build();
    }

    private CrashlyticsReport$Session populateSessionData(String object, long l2) {
        object = CrashlyticsReport$Session.builder().setStartedAt(l2).setIdentifier((String)object);
        Object object2 = GENERATOR;
        object = ((CrashlyticsReport$Session$Builder)object).setGenerator((String)object2);
        object2 = this.populateSessionApplicationData();
        object = ((CrashlyticsReport$Session$Builder)object).setApp((CrashlyticsReport$Session$Application)object2);
        object2 = this.populateSessionOperatingSystemData();
        object = ((CrashlyticsReport$Session$Builder)object).setOs((CrashlyticsReport$Session$OperatingSystem)object2);
        object2 = this.populateSessionDeviceData();
        return ((CrashlyticsReport$Session$Builder)object).setDevice((CrashlyticsReport$Session$Device)object2).setGeneratorType(3).build();
    }

    private CrashlyticsReport$Session$Device populateSessionDeviceData() {
        Object object = Environment.getDataDirectory().getPath();
        StatFs statFs = new StatFs((String)object);
        int n3 = CrashlyticsReportDataCapture.getDeviceArchitecture();
        int n4 = Runtime.getRuntime().availableProcessors();
        long l2 = CommonUtils.calculateTotalRamInBytes(this.context);
        long l3 = statFs.getBlockCount();
        long l4 = statFs.getBlockSize();
        l3 *= l4;
        boolean bl2 = CommonUtils.isEmulator();
        int n7 = CommonUtils.getDeviceState();
        String string2 = Build.MANUFACTURER;
        String string3 = Build.PRODUCT;
        object = CrashlyticsReport$Session$Device.builder().setArch(n3);
        String string4 = Build.MODEL;
        return ((CrashlyticsReport$Session$Device$Builder)object).setModel(string4).setCores(n4).setRam(l2).setDiskSpace(l3).setSimulator(bl2).setState(n7).setManufacturer(string2).setModelClass(string3).build();
    }

    private CrashlyticsReport$Session$OperatingSystem populateSessionOperatingSystemData() {
        CrashlyticsReport$Session$OperatingSystem$Builder crashlyticsReport$Session$OperatingSystem$Builder = CrashlyticsReport$Session$OperatingSystem.builder().setPlatform(3);
        String string2 = Build.VERSION.RELEASE;
        crashlyticsReport$Session$OperatingSystem$Builder = crashlyticsReport$Session$OperatingSystem$Builder.setVersion(string2);
        string2 = Build.VERSION.CODENAME;
        crashlyticsReport$Session$OperatingSystem$Builder = crashlyticsReport$Session$OperatingSystem$Builder.setBuildVersion(string2);
        boolean bl2 = CommonUtils.isRooted();
        return crashlyticsReport$Session$OperatingSystem$Builder.setJailbroken(bl2).build();
    }

    private CrashlyticsReport$Session$Event$Application$Execution$Signal populateSignalData() {
        CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder crashlyticsReport$Session$Event$Application$Execution$Signal$Builder = CrashlyticsReport$Session$Event$Application$Execution$Signal.builder();
        String string2 = SIGNAL_DEFAULT;
        return crashlyticsReport$Session$Event$Application$Execution$Signal$Builder.setName(string2).setCode(string2).setAddress(0L).build();
    }

    private CrashlyticsReport$Session$Event$Application$Execution$Thread populateThreadData(Thread thread2, StackTraceElement[] stackTraceElementArray) {
        return this.populateThreadData(thread2, stackTraceElementArray, 0);
    }

    private CrashlyticsReport$Session$Event$Application$Execution$Thread populateThreadData(Thread object, StackTraceElement[] object2, int n3) {
        CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Builder = CrashlyticsReport$Session$Event$Application$Execution$Thread.builder();
        object = ((Thread)object).getName();
        object = crashlyticsReport$Session$Event$Application$Execution$Thread$Builder.setName((String)object).setImportance(n3);
        object2 = this.populateFramesList((StackTraceElement[])object2, n3);
        return ((CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder)object).setFrames((List)object2).build();
    }

    private List populateThreadsList(TrimmedThrowableData object, Thread thread2, int n3, boolean bl2) {
        ArrayList<StackTraceElement[]> arrayList = new ArrayList<StackTraceElement[]>();
        object = ((TrimmedThrowableData)object).stacktrace;
        object = this.populateThreadData(thread2, (StackTraceElement[])object, n3);
        arrayList.add((StackTraceElement[])object);
        if (bl2) {
            object = Thread.getAllStackTraces().entrySet().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Object object2 = (StackTraceElement[])object.next();
                Thread thread3 = (Thread)object2.getKey();
                boolean bl3 = thread3.equals(thread2);
                if (bl3) continue;
                StackTraceTrimmingStrategy stackTraceTrimmingStrategy = this.stackTraceTrimmingStrategy;
                object2 = (StackTraceElement[])object2.getValue();
                object2 = stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])object2);
                object2 = this.populateThreadData(thread3, (StackTraceElement[])object2);
                arrayList.add((StackTraceElement[])object2);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private CrashlyticsReport$Session$Event$Application$ProcessDetails processDetailsFromApplicationExitInfo(CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        ProcessDetailsProvider processDetailsProvider = this.processDetailsProvider;
        String string2 = crashlyticsReport$ApplicationExitInfo.getProcessName();
        int n3 = crashlyticsReport$ApplicationExitInfo.getPid();
        int n4 = crashlyticsReport$ApplicationExitInfo.getImportance();
        return processDetailsProvider.buildProcessDetails(string2, n3, n4);
    }

    public CrashlyticsReport$Session$Event captureAnrEventData(CrashlyticsReport$ApplicationExitInfo object) {
        int n3 = this.context.getResources().getConfiguration().orientation;
        CrashlyticsReport$Session$Event$Builder crashlyticsReport$Session$Event$Builder = CrashlyticsReport$Session$Event.builder().setType("anr");
        long l2 = ((CrashlyticsReport$ApplicationExitInfo)object).getTimestamp();
        crashlyticsReport$Session$Event$Builder = crashlyticsReport$Session$Event$Builder.setTimestamp(l2);
        object = this.addBuildIdInfo((CrashlyticsReport$ApplicationExitInfo)object);
        object = this.populateEventApplicationData(n3, (CrashlyticsReport$ApplicationExitInfo)object);
        object = crashlyticsReport$Session$Event$Builder.setApp((CrashlyticsReport$Session$Event$Application)object);
        CrashlyticsReport$Session$Event$Device crashlyticsReport$Session$Event$Device = this.populateEventDeviceData(n3);
        return ((CrashlyticsReport$Session$Event$Builder)object).setDevice(crashlyticsReport$Session$Event$Device).build();
    }

    public CrashlyticsReport$Session$Event captureEventData(Throwable throwable, Thread thread2, String string2, long l2, int n3, int n4, boolean bl2) {
        int n7 = this.context.getResources().getConfiguration().orientation;
        Object object = this.stackTraceTrimmingStrategy;
        Object object2 = throwable;
        TrimmedThrowableData trimmedThrowableData = TrimmedThrowableData.makeTrimmedThrowableData(throwable, (StackTraceTrimmingStrategy)object);
        object = CrashlyticsReport$Session$Event.builder();
        object2 = string2;
        CrashlyticsReport$Session$Event$Builder crashlyticsReport$Session$Event$Builder = ((CrashlyticsReport$Session$Event$Builder)object).setType(string2).setTimestamp(l2);
        object = this;
        object = this.populateEventApplicationData(n7, trimmedThrowableData, thread2, n3, n4, bl2);
        object = crashlyticsReport$Session$Event$Builder.setApp((CrashlyticsReport$Session$Event$Application)object);
        object2 = this.populateEventDeviceData(n7);
        return ((CrashlyticsReport$Session$Event$Builder)object).setDevice((CrashlyticsReport$Session$Event$Device)object2).build();
    }

    public CrashlyticsReport captureReportData(String object, long l2) {
        CrashlyticsReport$Builder crashlyticsReport$Builder = this.buildReportData();
        object = this.populateSessionData((String)object, l2);
        return crashlyticsReport$Builder.setSession((CrashlyticsReport$Session)object).build();
    }
}

