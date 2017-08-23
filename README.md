
# git创建合并分支

>创建分支```dev```并切换到```dev```分支
```
$ git checkout -b dev
Switched to a new branch 'dev'
```
>```git checkout```命令加上```-b```参数表示创建并切换，相当于以下两条命令：

```
$ git checkout -b dev
Switched to a new branch 'dev'
```

>```git checkout```命令加上```-b```参数表示创建并切换，相当于以下两条命令：



```
$ git branch dev
$ git checkout dev 
Switched to branch 'dev'
```
>然后，用```git branch```命令查看当前分支：


```
$ git branch
* dev
  master
```

>```git branch```命令会列出所有分支，当前分支前面会标一个```*```号。
然后，我们就可以在```dev```分支上正常提交，比如对```readme.txt```做个修改，加上一行：

```
Creating a new branch is quick.
```

>然后提交：
```
$ git add readme.txt 
$ git commit -m "branch test"
[dev fec145a] branch test
 1 file changed, 1 insertion(+)
```

>现在，```dev```分支的工作完成，我们就可以切换回```master```分支：

```
$ git checkout master 
Switched to branch 'master'
```

>切换回```master```分支后，再查看一个```readme.txt```文件，刚才添加的内容不见了！因为那个提交是在```dev```分支上，而```master```分支此刻的提交点并没有变：

>现在，我们把```dev```分支的工作成果合并到```master```分支上：

```
$ git merge dev
Updating d17efd8..fec145a
Fast-forward
 readme.txt |    1 +
 1 file changed, 1 insertion(+)
```
>```git merge```命令用于合并指定分支到当前分支。合并后，再查看```readme.txt```的内容，就可以看到，和```dev```分支的最新提交是完全一样的。

>注意到上面的```Fast-forward```信息，```Git```告诉我们，这次合并是“快进模式”，也就是直接把```master```指向```dev```的当前提交，所以合并速度非常快。

>当然，也不是每次合并都能```Fast-forward```，我们后面会讲其他方式的合并。
合并完成后，就可以放心地删除```dev```分支了：


```
$ git branch -d dev
Deleted branch dev (was fec145a).
```

# 小结

>Git鼓励大量使用分支：

>查看分支：```git branch```

>创建分支：```git branch <name>```

>切换分支：```git checkout <name>```

>创建+切换分支：```git checkout -b <name>```

>合并某分支到当前分支：```git merge <name>```

>删除分支：```git branch -d <name>```