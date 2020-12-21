package com.topgun.example.model.abc
import java.io.IOException
import java.util
import java.util.zip.ZipEntry
import java.util.zip.ZipFile
class Bar {
  def methodA()
  {
    new Thread(new Runnable {
      override def run(): Unit = {
        var x = 0
        while (x < 1000){
          println(x)
          x+=1
        }
      }
      methodB()
    }).start()
  }
  def methodB(): Unit =
  {
    showZipContents()
  }

  def showZipContents(): Unit = {
    try {
      val zf = new ZipFile("/home/chempa/zip.zip")
      try {
        System.out.println(String.format("Inspecting contents of: %s\n", zf.getName))
        val zipEntries = zf.entries
        zipEntries.asIterator.forEachRemaining((entry: ZipEntry) => {
          def foo(entry: ZipEntry) = {
            System.out.println(String.format("Item: %s \nType: %s \nSize: %d\n", entry.getName, if (entry.isDirectory) "directory"
            else "file", entry.getSize))
          }

          foo(entry)
        })
      } catch {
        case e: IOException =>
          e.printStackTrace()
      } finally if (zf != null) zf.close()
    }
  }
}
