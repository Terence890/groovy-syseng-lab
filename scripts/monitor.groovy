#!/usr/bin/env groovy
import java.lang.management.ManagementFactory
import com.sun.management.OperatingSystemMXBean

// Simple system inspector (cross-platform)
def os = ManagementFactory.getOperatingSystemMXBean() as com.sun.management.OperatingSystemMXBean
def runtime = Runtime.runtime

def cpuLoad = (os.systemCpuLoad >= 0) ? String.format('%.2f', os.systemCpuLoad * 100) + '%' : 'n/a'

println "System: ${os.name} ${os.arch} ${os.version}"
println "Processors: ${os.availableProcessors}"
println "CPU load: ${cpuLoad}"
println "Total memory (MB): ${runtime.totalMemory() / (1024*1024)}"
println "Free memory (MB): ${runtime.freeMemory() / (1024*1024)}"
println "Used memory (MB): ${(runtime.totalMemory() - runtime.freeMemory()) / (1024*1024)}"
