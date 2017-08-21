
###场景：
####ScrollView嵌套多个GridView，需要实现的效果：每个GridView都能显示多行数据。
###问题：
####实际每个GridView只显示了首行数据。
###解决思路：
####自定义MyGridView继承GridView,重写onMesure()方法……