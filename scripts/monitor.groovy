#!/usr/bin/env groovy
import java.lang.management.ManagementFactory
import com.sun.management.OperatingSystemMXBean

// Simple system inspector (cross-platform)
def os = ManagementFactory.getOperatingSystemMXBean() as com.sun.management.OperatingSystemMXBean
def runtime = Runtime.runtime

def mb = 1024L * 1024L
def cpuPercent = (os.systemCpuLoad >= 0) ? (os.systemCpuLoad * 100.0d) : -1.0d
def totalMb = runtime.totalMemory() / (double) mb
def freeMb = runtime.freeMemory() / (double) mb
def usedMb = totalMb - freeMb
def usedPercent = (totalMb > 0) ? (usedMb / totalMb) * 100.0d : 0.0d
def freePercent = (totalMb > 0) ? (freeMb / totalMb) * 100.0d : 0.0d

def bar = { double percent, int width = 30 ->
	def clamped = Math.max(0.0d, Math.min(100.0d, percent))
	int filled = Math.round((clamped / 100.0d) * width) as int
	'[' + ('#' * filled).padRight(width, '-') + "] ${String.format('%.1f', clamped)}%"
}

println "System: ${os.name} ${os.arch} ${os.version}"
println "Processors: ${os.availableProcessors}"
println "Total memory (MB): ${String.format('%.2f', totalMb)}"
println "Free memory (MB): ${String.format('%.2f', freeMb)}"
println "Used memory (MB): ${String.format('%.2f', usedMb)}"
println ''
println 'Terminal Graphs'
println '---------------'
println(cpuPercent >= 0 ? "CPU load : ${bar(cpuPercent)}" : 'CPU load : n/a')
println "Mem used : ${bar(usedPercent)}"
println "Mem free : ${bar(freePercent)}"
