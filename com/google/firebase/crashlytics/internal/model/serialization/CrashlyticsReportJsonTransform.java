/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonReader
 */
package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder;
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
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$ObjectParser;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CrashlyticsReportJsonTransform {
    private static final DataEncoder CRASHLYTICS_REPORT_JSON_ENCODER;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        Configurator configurator = AutoCrashlyticsReportEncoder.CONFIG;
        CRASHLYTICS_REPORT_JSON_ENCODER = jsonDataEncoderBuilder.configureWith(configurator).ignoreNullValues(true).build();
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event$RolloutAssignment a(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame c(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$CustomAttribute d(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event$Application$Execution$BinaryImage e(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event$Application$Execution$Thread f(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$FilesPayload$File g(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseFile(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event$Application$ProcessDetails h(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader);
    }

    public static /* synthetic */ CrashlyticsReport$Session$Event i(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEvent(jsonReader);
    }

    private static CrashlyticsReport$Session$Application parseApp(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Application$Builder crashlyticsReport$Session$Application$Builder = CrashlyticsReport$Session$Application.builder();
        jsonReader.beginObject();
        block16: while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n3 = -1;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1975623094: {
                    String string3 = "displayVersion";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 5;
                    break;
                }
                case 719853845: {
                    String string3 = "installationUuid";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 4;
                    break;
                }
                case 351608024: {
                    String string3 = "version";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 3;
                    break;
                }
                case 213652010: {
                    String string3 = "developmentPlatformVersion";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case -519438642: {
                    String string3 = "developmentPlatform";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -1618432855: {
                    String string3 = "identifier";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Application$Builder.setDisplayVersion(string2);
                    continue block16;
                }
                case 4: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Application$Builder.setInstallationUuid(string2);
                    continue block16;
                }
                case 3: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Application$Builder.setVersion(string2);
                    continue block16;
                }
                case 2: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Application$Builder.setDevelopmentPlatformVersion(string2);
                    continue block16;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Application$Builder.setDevelopmentPlatform(string2);
                    continue block16;
                }
                case 0: 
            }
            string2 = jsonReader.nextString();
            crashlyticsReport$Session$Application$Builder.setIdentifier(string2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Application$Builder.build();
    }

    private static CrashlyticsReport$ApplicationExitInfo parseAppExitInfo(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$ApplicationExitInfo$Builder crashlyticsReport$ApplicationExitInfo$Builder = CrashlyticsReport$ApplicationExitInfo.builder();
        jsonReader.beginObject();
        block22: while ((n3 = jsonReader.hasNext()) != 0) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 2125650548: {
                    String string2 = "importance";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 8;
                    break;
                }
                case 723857505: {
                    String string2 = "traceFile";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 7;
                    break;
                }
                case 722137681: {
                    String string2 = "reasonCode";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 6;
                    break;
                }
                case 202325402: {
                    String string2 = "processName";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 5;
                    break;
                }
                case 55126294: {
                    String string2 = "timestamp";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 4;
                    break;
                }
                case 113234: {
                    String string2 = "rss";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case 111312: {
                    String string2 = "pss";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case 110987: {
                    String string2 = "pid";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -1516200806: {
                    String string2 = "buildIdMappingForArch";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block22;
                }
                case 8: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$ApplicationExitInfo$Builder.setImportance(n3);
                    continue block22;
                }
                case 7: {
                    object = jsonReader.nextString();
                    crashlyticsReport$ApplicationExitInfo$Builder.setTraceFile((String)object);
                    continue block22;
                }
                case 6: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$ApplicationExitInfo$Builder.setReasonCode(n3);
                    continue block22;
                }
                case 5: {
                    object = jsonReader.nextString();
                    crashlyticsReport$ApplicationExitInfo$Builder.setProcessName((String)object);
                    continue block22;
                }
                case 4: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$ApplicationExitInfo$Builder.setTimestamp(l2);
                    continue block22;
                }
                case 3: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$ApplicationExitInfo$Builder.setRss(l2);
                    continue block22;
                }
                case 2: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$ApplicationExitInfo$Builder.setPss(l2);
                    continue block22;
                }
                case 1: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$ApplicationExitInfo$Builder.setPid(n3);
                    continue block22;
                }
                case 0: 
            }
            object = new Object();
            object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
            crashlyticsReport$ApplicationExitInfo$Builder.setBuildIdMappingForArch((List)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$ApplicationExitInfo$Builder.build();
    }

    private static List parseArray(JsonReader jsonReader, CrashlyticsReportJsonTransform$ObjectParser crashlyticsReportJsonTransform$ObjectParser) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        jsonReader.beginArray();
        while (bl2 = jsonReader.hasNext()) {
            Object object = crashlyticsReportJsonTransform$ObjectParser.parse(jsonReader);
            arrayList.add(object);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    private static CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch parseBuildIdMappingForArch(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder = CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch.builder();
        jsonReader.beginObject();
        block10: while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n3 = -1;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 230943785: {
                    String string3 = "buildId";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case 3002454: {
                    String string3 = "arch";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -609862170: {
                    String string3 = "libraryName";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.setBuildId(string2);
                    continue block10;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.setArch(string2);
                    continue block10;
                }
                case 0: 
            }
            string2 = jsonReader.nextString();
            crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.setLibraryName(string2);
        }
        jsonReader.endObject();
        return crashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder.build();
    }

    private static CrashlyticsReport$CustomAttribute parseCustomAttribute(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$CustomAttribute$Builder crashlyticsReport$CustomAttribute$Builder = CrashlyticsReport$CustomAttribute.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            String string3 = "key";
            boolean bl3 = string2.equals(string3);
            if (!bl3) {
                string3 = "value";
                bl2 = string2.equals(string3);
                if (!bl2) {
                    jsonReader.skipValue();
                    continue;
                }
                string2 = jsonReader.nextString();
                crashlyticsReport$CustomAttribute$Builder.setValue(string2);
                continue;
            }
            string2 = jsonReader.nextString();
            crashlyticsReport$CustomAttribute$Builder.setKey(string2);
        }
        jsonReader.endObject();
        return crashlyticsReport$CustomAttribute$Builder.build();
    }

    private static CrashlyticsReport$Session$Device parseDevice(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Device$Builder crashlyticsReport$Session$Device$Builder = CrashlyticsReport$Session$Device.builder();
        jsonReader.beginObject();
        block22: while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n3 = -1;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 2078953423: {
                    String string3 = "modelClass";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 8;
                    break;
                }
                case 109757585: {
                    String string3 = "state";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 7;
                    break;
                }
                case 104069929: {
                    String string3 = "model";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 6;
                    break;
                }
                case 94848180: {
                    String string3 = "cores";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 5;
                    break;
                }
                case 81784169: {
                    String string3 = "diskSpace";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 4;
                    break;
                }
                case 3002454: {
                    String string3 = "arch";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 3;
                    break;
                }
                case 112670: {
                    String string3 = "ram";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case -1969347631: {
                    String string3 = "manufacturer";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -1981332476: {
                    String string3 = "simulator";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block22;
                }
                case 8: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Device$Builder.setModelClass(string2);
                    continue block22;
                }
                case 7: {
                    bl2 = jsonReader.nextInt();
                    crashlyticsReport$Session$Device$Builder.setState((int)(bl2 ? 1 : 0));
                    continue block22;
                }
                case 6: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Device$Builder.setModel(string2);
                    continue block22;
                }
                case 5: {
                    bl2 = jsonReader.nextInt();
                    crashlyticsReport$Session$Device$Builder.setCores((int)(bl2 ? 1 : 0));
                    continue block22;
                }
                case 4: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Device$Builder.setDiskSpace(l2);
                    continue block22;
                }
                case 3: {
                    bl2 = jsonReader.nextInt();
                    crashlyticsReport$Session$Device$Builder.setArch((int)(bl2 ? 1 : 0));
                    continue block22;
                }
                case 2: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Device$Builder.setRam(l2);
                    continue block22;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Device$Builder.setManufacturer(string2);
                    continue block22;
                }
                case 0: 
            }
            bl2 = jsonReader.nextBoolean();
            crashlyticsReport$Session$Device$Builder.setSimulator(bl2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Device$Builder.build();
    }

    private static CrashlyticsReport$Session$Event parseEvent(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$Builder crashlyticsReport$Session$Event$Builder = CrashlyticsReport$Session$Event.builder();
        jsonReader.beginObject();
        block16: while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n3 = -1;
            int n4 = ((String)object).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 55126294: {
                    String string2 = "timestamp";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 5;
                    break;
                }
                case 3575610: {
                    String string2 = "type";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 4;
                    break;
                }
                case 107332: {
                    String string2 = "log";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 3;
                    break;
                }
                case 96801: {
                    String string2 = "app";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case -259312414: {
                    String string2 = "rollouts";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -1335157162: {
                    String string2 = "device";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$Builder.setTimestamp(l2);
                    continue block16;
                }
                case 4: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Builder.setType((String)object);
                    continue block16;
                }
                case 3: {
                    object = CrashlyticsReportJsonTransform.parseEventLog(jsonReader);
                    crashlyticsReport$Session$Event$Builder.setLog((CrashlyticsReport$Session$Event$Log)object);
                    continue block16;
                }
                case 2: {
                    object = CrashlyticsReportJsonTransform.parseEventApp(jsonReader);
                    crashlyticsReport$Session$Event$Builder.setApp((CrashlyticsReport$Session$Event$Application)object);
                    continue block16;
                }
                case 1: {
                    object = CrashlyticsReportJsonTransform.parseEventRolloutsState(jsonReader);
                    crashlyticsReport$Session$Event$Builder.setRollouts((CrashlyticsReport$Session$Event$RolloutsState)object);
                    continue block16;
                }
                case 0: 
            }
            object = CrashlyticsReportJsonTransform.parseEventDevice(jsonReader);
            crashlyticsReport$Session$Event$Builder.setDevice((CrashlyticsReport$Session$Event$Device)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application parseEventApp(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Session$Event$Application$Builder crashlyticsReport$Session$Event$Application$Builder = CrashlyticsReport$Session$Event$Application.builder();
        jsonReader.beginObject();
        block18: while ((n3 = jsonReader.hasNext()) != 0) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 1847730860: {
                    String string2 = "currentProcessDetails";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 6;
                    break;
                }
                case 928737948: {
                    String string2 = "uiOrientation";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 5;
                    break;
                }
                case 555169704: {
                    String string2 = "customAttributes";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 4;
                    break;
                }
                case -80231855: {
                    String string2 = "internalKeys";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case -1090974952: {
                    String string2 = "execution";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case -1332194002: {
                    String string2 = "background";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -1405314732: {
                    String string2 = "appProcessDetails";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block18;
                }
                case 6: {
                    object = CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader);
                    crashlyticsReport$Session$Event$Application$Builder.setCurrentProcessDetails((CrashlyticsReport$Session$Event$Application$ProcessDetails)object);
                    continue block18;
                }
                case 5: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Application$Builder.setUiOrientation(n3);
                    continue block18;
                }
                case 4: {
                    object = new Object();
                    object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
                    crashlyticsReport$Session$Event$Application$Builder.setCustomAttributes((List)object);
                    continue block18;
                }
                case 3: {
                    object = new Object();
                    object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
                    crashlyticsReport$Session$Event$Application$Builder.setInternalKeys((List)object);
                    continue block18;
                }
                case 2: {
                    object = CrashlyticsReportJsonTransform.parseEventExecution(jsonReader);
                    crashlyticsReport$Session$Event$Application$Builder.setExecution((CrashlyticsReport$Session$Event$Application$Execution)object);
                    continue block18;
                }
                case 1: {
                    n3 = (int)(jsonReader.nextBoolean() ? 1 : 0);
                    object = n3 != 0;
                    crashlyticsReport$Session$Event$Application$Builder.setBackground((Boolean)object);
                    continue block18;
                }
                case 0: 
            }
            object = new Object();
            object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
            crashlyticsReport$Session$Event$Application$Builder.setAppProcessDetails((List)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$Execution$BinaryImage parseEventBinaryImage(JsonReader jsonReader) {
        boolean bl2;
        int n3 = 2;
        CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder = CrashlyticsReport$Session$Event$Application$Execution$BinaryImage.builder();
        jsonReader.beginObject();
        block12: while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 1153765347: {
                    String string2 = "baseAddress";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 3;
                    break;
                }
                case 3601339: {
                    String string2 = "uuid";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 2;
                    break;
                }
                case 3530753: {
                    String string2 = "size";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 1;
                    break;
                }
                case 3373707: {
                    String string2 = "name";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setBaseAddress(l2);
                    continue block12;
                }
                case 2: {
                    object = Base64.decode((String)jsonReader.nextString(), (int)n3);
                    crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setUuidFromUtf8Bytes((byte[])object);
                    continue block12;
                }
                case 1: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setSize(l2);
                    continue block12;
                }
                case 0: 
            }
            object = jsonReader.nextString();
            crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.setName((String)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Device parseEventDevice(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Session$Event$Device$Builder crashlyticsReport$Session$Event$Device$Builder = CrashlyticsReport$Session$Event$Device.builder();
        jsonReader.beginObject();
        block16: while ((n3 = jsonReader.hasNext()) != 0) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 1516795582: {
                    String string2 = "proximityOn";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 5;
                    break;
                }
                case 976541947: {
                    String string2 = "ramUsed";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 4;
                    break;
                }
                case 279795450: {
                    String string2 = "diskUsed";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case -1439500848: {
                    String string2 = "orientation";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case -1455558134: {
                    String string2 = "batteryVelocity";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -1708606089: {
                    String string2 = "batteryLevel";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    n3 = jsonReader.nextBoolean();
                    crashlyticsReport$Session$Event$Device$Builder.setProximityOn(n3 != 0);
                    continue block16;
                }
                case 4: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$Device$Builder.setRamUsed(l2);
                    continue block16;
                }
                case 3: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$Device$Builder.setDiskUsed(l2);
                    continue block16;
                }
                case 2: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Device$Builder.setOrientation(n3);
                    continue block16;
                }
                case 1: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Device$Builder.setBatteryVelocity(n3);
                    continue block16;
                }
                case 0: 
            }
            double d2 = jsonReader.nextDouble();
            object = d2;
            crashlyticsReport$Session$Event$Device$Builder.setBatteryLevel((Double)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Device$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$Execution parseEventExecution(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$Application$Execution$Builder crashlyticsReport$Session$Event$Application$Execution$Builder = CrashlyticsReport$Session$Event$Application$Execution.builder();
        jsonReader.beginObject();
        block14: while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n3 = -1;
            int n4 = ((String)object).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1481625679: {
                    String string2 = "exception";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 4;
                    break;
                }
                case 937615455: {
                    String string2 = "binaries";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 3;
                    break;
                }
                case -902467928: {
                    String string2 = "signal";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case -1337936983: {
                    String string2 = "threads";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -1375141843: {
                    String string2 = "appExitInfo";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    object = CrashlyticsReportJsonTransform.parseEventExecutionException(jsonReader);
                    crashlyticsReport$Session$Event$Application$Execution$Builder.setException((CrashlyticsReport$Session$Event$Application$Execution$Exception)object);
                    continue block14;
                }
                case 3: {
                    object = new Object();
                    object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
                    crashlyticsReport$Session$Event$Application$Execution$Builder.setBinaries((List)object);
                    continue block14;
                }
                case 2: {
                    object = CrashlyticsReportJsonTransform.parseEventSignal(jsonReader);
                    crashlyticsReport$Session$Event$Application$Execution$Builder.setSignal((CrashlyticsReport$Session$Event$Application$Execution$Signal)object);
                    continue block14;
                }
                case 1: {
                    object = new Object();
                    object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
                    crashlyticsReport$Session$Event$Application$Execution$Builder.setThreads((List)object);
                    continue block14;
                }
                case 0: 
            }
            object = CrashlyticsReportJsonTransform.parseAppExitInfo(jsonReader);
            crashlyticsReport$Session$Event$Application$Execution$Builder.setAppExitInfo((CrashlyticsReport$ApplicationExitInfo)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$Execution$Exception parseEventExecutionException(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder crashlyticsReport$Session$Event$Application$Execution$Exception$Builder = CrashlyticsReport$Session$Event$Application$Execution$Exception.builder();
        jsonReader.beginObject();
        block14: while ((n3 = jsonReader.hasNext()) != 0) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 581754413: {
                    String string2 = "overflowCount";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 4;
                    break;
                }
                case 91997906: {
                    String string2 = "causedBy";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case 3575610: {
                    String string2 = "type";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case -934964668: {
                    String string2 = "reason";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -1266514778: {
                    String string2 = "frames";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder.setOverflowCount(n3);
                    continue block14;
                }
                case 3: {
                    object = CrashlyticsReportJsonTransform.parseEventExecutionException(jsonReader);
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder.setCausedBy((CrashlyticsReport$Session$Event$Application$Execution$Exception)object);
                    continue block14;
                }
                case 2: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder.setType((String)object);
                    continue block14;
                }
                case 1: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Exception$Builder.setReason((String)object);
                    continue block14;
                }
                case 0: 
            }
            object = new Object();
            object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
            crashlyticsReport$Session$Event$Application$Execution$Exception$Builder.setFrames((List)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Exception$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame parseEventFrame(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder = CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame.builder();
        jsonReader.beginObject();
        block14: while ((n3 = jsonReader.hasNext()) != 0) {
            long l2;
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n4 = -1;
            int n7 = string2.hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 2125650548: {
                    String string3 = "importance";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 4;
                    break;
                }
                case 3143036: {
                    String string3 = "file";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case 3571: {
                    String string3 = "pc";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case -887523944: {
                    String string3 = "symbol";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -1019779949: {
                    String string3 = "offset";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.setImportance(n3);
                    continue block14;
                }
                case 3: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.setFile(string2);
                    continue block14;
                }
                case 2: {
                    l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.setPc(l2);
                    continue block14;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.setSymbol(string2);
                    continue block14;
                }
                case 0: 
            }
            l2 = jsonReader.nextLong();
            crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.setOffset(l2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Log parseEventLog(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$Log$Builder crashlyticsReport$Session$Event$Log$Builder = CrashlyticsReport$Session$Event$Log.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            String string2;
            String string3 = jsonReader.nextName();
            bl2 = string3.equals(string2 = "content");
            if (bl2) {
                string3 = jsonReader.nextString();
                crashlyticsReport$Session$Event$Log$Builder.setContent(string3);
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Log$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$RolloutAssignment parseEventRolloutsAssignment(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$RolloutAssignment$Builder crashlyticsReport$Session$Event$RolloutAssignment$Builder = CrashlyticsReport$Session$Event$RolloutAssignment.builder();
        jsonReader.beginObject();
        block12: while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n3 = -1;
            int n4 = ((String)object).hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1124454216: {
                    String string2 = "parameterValue";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 3;
                    break;
                }
                case 1098747284: {
                    String string2 = "rolloutVariant";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case -1027290370: {
                    String string2 = "templateVersion";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -1536268810: {
                    String string2 = "parameterKey";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Event$RolloutAssignment$Builder.setParameterValue((String)object);
                    continue block12;
                }
                case 2: {
                    object = CrashlyticsReportJsonTransform.parseRolloutAssignmentRolloutVariant(jsonReader);
                    crashlyticsReport$Session$Event$RolloutAssignment$Builder.setRolloutVariant((CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant)object);
                    continue block12;
                }
                case 1: {
                    long l2 = jsonReader.nextLong();
                    crashlyticsReport$Session$Event$RolloutAssignment$Builder.setTemplateVersion(l2);
                    continue block12;
                }
                case 0: 
            }
            object = jsonReader.nextString();
            crashlyticsReport$Session$Event$RolloutAssignment$Builder.setParameterKey((String)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$RolloutAssignment$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$RolloutsState parseEventRolloutsState(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$RolloutsState$Builder crashlyticsReport$Session$Event$RolloutsState$Builder = CrashlyticsReport$Session$Event$RolloutsState.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            String string2 = "assignments";
            bl2 = ((String)object).equals(string2);
            if (!bl2) {
                jsonReader.skipValue();
                continue;
            }
            object = new Object();
            object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
            crashlyticsReport$Session$Event$RolloutsState$Builder.setRolloutAssignments((List)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$RolloutsState$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$Execution$Signal parseEventSignal(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder crashlyticsReport$Session$Event$Application$Execution$Signal$Builder = CrashlyticsReport$Session$Event$Application$Execution$Signal.builder();
        jsonReader.beginObject();
        block10: while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n3 = -1;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 3373707: {
                    String string3 = "name";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case 3059181: {
                    String string3 = "code";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -1147692044: {
                    String string3 = "address";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Signal$Builder.setName(string2);
                    continue block10;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Signal$Builder.setCode(string2);
                    continue block10;
                }
                case 0: 
            }
            long l2 = jsonReader.nextLong();
            crashlyticsReport$Session$Event$Application$Execution$Signal$Builder.setAddress(l2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Signal$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$Execution$Thread parseEventThread(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Builder = CrashlyticsReport$Session$Event$Application$Execution$Thread.builder();
        jsonReader.beginObject();
        block10: while ((n3 = jsonReader.hasNext()) != 0) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 2125650548: {
                    String string2 = "importance";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case 3373707: {
                    String string2 = "name";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -1266514778: {
                    String string2 = "frames";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Builder.setImportance(n3);
                    continue block10;
                }
                case 1: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$Execution$Thread$Builder.setName((String)object);
                    continue block10;
                }
                case 0: 
            }
            object = new Object();
            object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
            crashlyticsReport$Session$Event$Application$Execution$Thread$Builder.setFrames((List)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$Execution$Thread$Builder.build();
    }

    private static CrashlyticsReport$FilesPayload$File parseFile(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$FilesPayload$File$Builder crashlyticsReport$FilesPayload$File$Builder = CrashlyticsReport$FilesPayload$File.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            String string2 = "filename";
            int n3 = ((String)object).equals(string2);
            if (n3 == 0) {
                string2 = "contents";
                bl2 = ((String)object).equals(string2);
                if (!bl2) {
                    jsonReader.skipValue();
                    continue;
                }
                object = jsonReader.nextString();
                n3 = 2;
                object = Base64.decode((String)object, (int)n3);
                crashlyticsReport$FilesPayload$File$Builder.setContents((byte[])object);
                continue;
            }
            object = jsonReader.nextString();
            crashlyticsReport$FilesPayload$File$Builder.setFilename((String)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$FilesPayload$File$Builder.build();
    }

    private static CrashlyticsReport$FilesPayload parseNdkPayload(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$FilesPayload$Builder crashlyticsReport$FilesPayload$Builder = CrashlyticsReport$FilesPayload.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            Object object = jsonReader.nextName();
            object.getClass();
            String string2 = "files";
            boolean bl3 = ((String)object).equals(string2);
            if (!bl3) {
                string2 = "orgId";
                bl2 = ((String)object).equals(string2);
                if (!bl2) {
                    jsonReader.skipValue();
                    continue;
                }
                object = jsonReader.nextString();
                crashlyticsReport$FilesPayload$Builder.setOrgId((String)object);
                continue;
            }
            object = new Object();
            object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
            crashlyticsReport$FilesPayload$Builder.setFiles((List)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$FilesPayload$Builder.build();
    }

    private static CrashlyticsReport$Session$OperatingSystem parseOs(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$OperatingSystem$Builder crashlyticsReport$Session$OperatingSystem$Builder = CrashlyticsReport$Session$OperatingSystem.builder();
        jsonReader.beginObject();
        block12: while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n3 = -1;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 1874684019: {
                    String string3 = "platform";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 3;
                    break;
                }
                case 351608024: {
                    String string3 = "version";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 2;
                    break;
                }
                case -293026577: {
                    String string3 = "jailbroken";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 1;
                    break;
                }
                case -911706486: {
                    String string3 = "buildVersion";
                    bl2 = string2.equals(string3);
                    if (!bl2) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    bl2 = jsonReader.nextInt();
                    crashlyticsReport$Session$OperatingSystem$Builder.setPlatform((int)(bl2 ? 1 : 0));
                    continue block12;
                }
                case 2: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$OperatingSystem$Builder.setVersion(string2);
                    continue block12;
                }
                case 1: {
                    bl2 = jsonReader.nextBoolean();
                    crashlyticsReport$Session$OperatingSystem$Builder.setJailbroken(bl2);
                    continue block12;
                }
                case 0: 
            }
            string2 = jsonReader.nextString();
            crashlyticsReport$Session$OperatingSystem$Builder.setBuildVersion(string2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$OperatingSystem$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$Application$ProcessDetails parseProcessDetails(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder crashlyticsReport$Session$Event$Application$ProcessDetails$Builder = CrashlyticsReport$Session$Event$Application$ProcessDetails.builder();
        jsonReader.beginObject();
        block12: while ((n3 = jsonReader.hasNext()) != 0) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            int n4 = -1;
            int n7 = string2.hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 2125650548: {
                    String string3 = "importance";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case 1694598382: {
                    String string3 = "defaultProcess";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case 202325402: {
                    String string3 = "processName";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case 110987: {
                    String string3 = "pid";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Session$Event$Application$ProcessDetails$Builder.setImportance(n3);
                    continue block12;
                }
                case 2: {
                    n3 = (int)(jsonReader.nextBoolean() ? 1 : 0);
                    crashlyticsReport$Session$Event$Application$ProcessDetails$Builder.setDefaultProcess(n3 != 0);
                    continue block12;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    crashlyticsReport$Session$Event$Application$ProcessDetails$Builder.setProcessName(string2);
                    continue block12;
                }
                case 0: 
            }
            n3 = jsonReader.nextInt();
            crashlyticsReport$Session$Event$Application$ProcessDetails$Builder.setPid(n3);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$Application$ProcessDetails$Builder.build();
    }

    private static CrashlyticsReport parseReport(JsonReader jsonReader) {
        int n3;
        CrashlyticsReport$Builder crashlyticsReport$Builder = CrashlyticsReport.builder();
        jsonReader.beginObject();
        block28: while ((n3 = jsonReader.hasNext()) != 0) {
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 1984987798: {
                    String string2 = "session";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 11;
                    break;
                }
                case 1975623094: {
                    String string2 = "displayVersion";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 10;
                    break;
                }
                case 1874684019: {
                    String string2 = "platform";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 9;
                    break;
                }
                case 1047652060: {
                    String string2 = "firebaseInstallationId";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 8;
                    break;
                }
                case 719853845: {
                    String string2 = "installationUuid";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 7;
                    break;
                }
                case 344431858: {
                    String string2 = "gmpAppId";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 6;
                    break;
                }
                case -401988390: {
                    String string2 = "firebaseAuthenticationToken";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 5;
                    break;
                }
                case -911706486: {
                    String string2 = "buildVersion";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 4;
                    break;
                }
                case -1375141843: {
                    String string2 = "appExitInfo";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 3;
                    break;
                }
                case -1907185581: {
                    String string2 = "appQualitySessionId";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 2;
                    break;
                }
                case -1962630338: {
                    String string2 = "sdkVersion";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 1;
                    break;
                }
                case -2118372775: {
                    String string2 = "ndkPayload";
                    n3 = (int)(((String)object).equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block28;
                }
                case 11: {
                    object = CrashlyticsReportJsonTransform.parseSession(jsonReader);
                    crashlyticsReport$Builder.setSession((CrashlyticsReport$Session)object);
                    continue block28;
                }
                case 10: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setDisplayVersion((String)object);
                    continue block28;
                }
                case 9: {
                    n3 = jsonReader.nextInt();
                    crashlyticsReport$Builder.setPlatform(n3);
                    continue block28;
                }
                case 8: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setFirebaseInstallationId((String)object);
                    continue block28;
                }
                case 7: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setInstallationUuid((String)object);
                    continue block28;
                }
                case 6: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setGmpAppId((String)object);
                    continue block28;
                }
                case 5: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setFirebaseAuthenticationToken((String)object);
                    continue block28;
                }
                case 4: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setBuildVersion((String)object);
                    continue block28;
                }
                case 3: {
                    object = CrashlyticsReportJsonTransform.parseAppExitInfo(jsonReader);
                    crashlyticsReport$Builder.setAppExitInfo((CrashlyticsReport$ApplicationExitInfo)object);
                    continue block28;
                }
                case 2: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setAppQualitySessionId((String)object);
                    continue block28;
                }
                case 1: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Builder.setSdkVersion((String)object);
                    continue block28;
                }
                case 0: 
            }
            object = CrashlyticsReportJsonTransform.parseNdkPayload(jsonReader);
            crashlyticsReport$Builder.setNdkPayload((CrashlyticsReport$FilesPayload)object);
        }
        jsonReader.endObject();
        return crashlyticsReport$Builder.build();
    }

    private static CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant parseRolloutAssignmentRolloutVariant(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder = CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.getClass();
            String string3 = "variantId";
            boolean bl3 = string2.equals(string3);
            if (!bl3) {
                string3 = "rolloutId";
                bl2 = string2.equals(string3);
                if (!bl2) {
                    jsonReader.skipValue();
                    continue;
                }
                string2 = jsonReader.nextString();
                crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder.setRolloutId(string2);
                continue;
            }
            string2 = jsonReader.nextString();
            crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder.setVariantId(string2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder.build();
    }

    private static CrashlyticsReport$Session parseSession(JsonReader jsonReader) {
        boolean bl2;
        int n3 = 2;
        CrashlyticsReport$Session$Builder crashlyticsReport$Session$Builder = CrashlyticsReport$Session.builder();
        jsonReader.beginObject();
        block28: while (bl2 = jsonReader.hasNext()) {
            long l2;
            Object object = jsonReader.nextName();
            object.getClass();
            int n4 = -1;
            int n7 = ((String)object).hashCode();
            switch (n7) {
                default: {
                    break;
                }
                case 2047016109: {
                    String string2 = "generatorType";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 11;
                    break;
                }
                case 1025385094: {
                    String string2 = "crashed";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 10;
                    break;
                }
                case 286956243: {
                    String string2 = "generator";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 9;
                    break;
                }
                case 3599307: {
                    String string2 = "user";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 8;
                    break;
                }
                case 96801: {
                    String string2 = "app";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 7;
                    break;
                }
                case 3556: {
                    String string2 = "os";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 6;
                    break;
                }
                case -1291329255: {
                    String string2 = "events";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 5;
                    break;
                }
                case -1335157162: {
                    String string2 = "device";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 4;
                    break;
                }
                case -1606742899: {
                    String string2 = "endedAt";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 3;
                    break;
                }
                case -1618432855: {
                    String string2 = "identifier";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 2;
                    break;
                }
                case -1907185581: {
                    String string2 = "appQualitySessionId";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 1;
                    break;
                }
                case -2128794476: {
                    String string2 = "startedAt";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2) break;
                    n4 = 0;
                }
            }
            switch (n4) {
                default: {
                    jsonReader.skipValue();
                    continue block28;
                }
                case 11: {
                    bl2 = jsonReader.nextInt();
                    crashlyticsReport$Session$Builder.setGeneratorType((int)(bl2 ? 1 : 0));
                    continue block28;
                }
                case 10: {
                    bl2 = jsonReader.nextBoolean();
                    crashlyticsReport$Session$Builder.setCrashed(bl2);
                    continue block28;
                }
                case 9: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Builder.setGenerator((String)object);
                    continue block28;
                }
                case 8: {
                    object = CrashlyticsReportJsonTransform.parseUser(jsonReader);
                    crashlyticsReport$Session$Builder.setUser((CrashlyticsReport$Session$User)object);
                    continue block28;
                }
                case 7: {
                    object = CrashlyticsReportJsonTransform.parseApp(jsonReader);
                    crashlyticsReport$Session$Builder.setApp((CrashlyticsReport$Session$Application)object);
                    continue block28;
                }
                case 6: {
                    object = CrashlyticsReportJsonTransform.parseOs(jsonReader);
                    crashlyticsReport$Session$Builder.setOs((CrashlyticsReport$Session$OperatingSystem)object);
                    continue block28;
                }
                case 5: {
                    object = new Object();
                    object = CrashlyticsReportJsonTransform.parseArray(jsonReader, (CrashlyticsReportJsonTransform$ObjectParser)object);
                    crashlyticsReport$Session$Builder.setEvents((List)object);
                    continue block28;
                }
                case 4: {
                    object = CrashlyticsReportJsonTransform.parseDevice(jsonReader);
                    crashlyticsReport$Session$Builder.setDevice((CrashlyticsReport$Session$Device)object);
                    continue block28;
                }
                case 3: {
                    l2 = jsonReader.nextLong();
                    object = l2;
                    crashlyticsReport$Session$Builder.setEndedAt((Long)object);
                    continue block28;
                }
                case 2: {
                    object = Base64.decode((String)jsonReader.nextString(), (int)n3);
                    crashlyticsReport$Session$Builder.setIdentifierFromUtf8Bytes((byte[])object);
                    continue block28;
                }
                case 1: {
                    object = jsonReader.nextString();
                    crashlyticsReport$Session$Builder.setAppQualitySessionId((String)object);
                    continue block28;
                }
                case 0: 
            }
            l2 = jsonReader.nextLong();
            crashlyticsReport$Session$Builder.setStartedAt(l2);
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$Builder.build();
    }

    private static CrashlyticsReport$Session$User parseUser(JsonReader jsonReader) {
        boolean bl2;
        CrashlyticsReport$Session$User$Builder crashlyticsReport$Session$User$Builder = CrashlyticsReport$Session$User.builder();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            String string2;
            String string3 = jsonReader.nextName();
            bl2 = string3.equals(string2 = "identifier");
            if (bl2) {
                string3 = jsonReader.nextString();
                crashlyticsReport$Session$User$Builder.setIdentifier(string3);
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return crashlyticsReport$Session$User$Builder.build();
    }

    /*
     * Exception decompiling
     */
    public CrashlyticsReport$ApplicationExitInfo applicationExitInfoFromJson(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 43->49)] java.lang.IllegalStateException
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

    public String applicationExitInfoToJson(CrashlyticsReport$ApplicationExitInfo crashlyticsReport$ApplicationExitInfo) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(crashlyticsReport$ApplicationExitInfo);
    }

    /*
     * Exception decompiling
     */
    public CrashlyticsReport$Session$Event eventFromJson(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 43->49)] java.lang.IllegalStateException
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

    public String eventToJson(CrashlyticsReport$Session$Event crashlyticsReport$Session$Event) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(crashlyticsReport$Session$Event);
    }

    /*
     * Exception decompiling
     */
    public CrashlyticsReport reportFromJson(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 43->49)] java.lang.IllegalStateException
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

    public String reportToJson(CrashlyticsReport crashlyticsReport) {
        return CRASHLYTICS_REPORT_JSON_ENCODER.encode(crashlyticsReport);
    }
}

