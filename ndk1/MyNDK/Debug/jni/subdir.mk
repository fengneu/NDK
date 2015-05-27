################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../jni/Store.c \
../jni/com_packtpub_Store.c 

OBJS += \
./jni/Store.o \
./jni/com_packtpub_Store.o 

C_DEPS += \
./jni/Store.d \
./jni/com_packtpub_Store.d 


# Each subdirectory must supply rules for building sources it contributes
jni/%.o: ../jni/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -I/Users/Lioncraft/android-ndk-r9d/platforms/android-8/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-9/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-9/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-9/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-12/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-12/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-12/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-13/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-13/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-13/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-14/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-14/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-14/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-15/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-15/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-15/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-16/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-16/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-16/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-17/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-17/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-17/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-18/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-18/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-18/arch-x86/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-19/arch-arm/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-19/arch-mips/usr/include -I/Users/Lioncraft/android-ndk-r9d/platforms/android-19/arch-x86/usr/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


