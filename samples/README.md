# RFP Android SDK

[![CircleCI](https://circleci.com/gh/fout/rfp_android_sdk.svg?style=svg&circle-token=5ea0b70181b89f19118af1d020d0debd37504f4d)](https://circleci.com/gh/fout/rfp_android_sdk)

## Getting Started

### Requirements

- [JDK 7 or later](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Android Studio 2.3 or later](https://developer.android.com/studio/index.html)

### Instructions

```sh
git clone git@github.com:fout/rfp_android_sdk.git
cd rfp_android_sdk
open -a "Android Studio" .
```

### Running the tests

Use Android Studio, or run command:

```sh
./gradlew lint
./gradlew test
```

We use [CircleCI](https://circleci.com/) for continuous integration. See the [project page](https://circleci.com/gh/fout/rfp_android_sdk).

## Deployment

### Library

```sh
./gradlew assembleDebug   # for debug
./gradlew assembleRelease # for release
```

### Demo Application

We use [Fabric](https://fabric.io/). See the [project page](https://fabric.io/freakout3/android/apps/jp.fout.rfp.android.demo.app/beta/releases/latest).

```sh
./gradlew crashlyticsUploadDistributionDebug   # for debug
./gradlew crashlyticsUploadDistributionRelease # for release
```

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/fout/rfp_android_sdk/tags).

