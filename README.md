# git fetch命令
从一个或多个其他存储库中获取分支和/或标签(统称为“引用”)以及完成其历史所必需的对象。 远程跟踪分支已更新(Git术语叫做````commit````)，需要将这些更新取回本地，这时就要用到````git fetch````命令。

# 使用语法
>````git fetch````命令用于从另一个存储库下载对象和引用。
```
git fetch [<options>] [<repository> [<refspec>…]]
git fetch [<options>] <group>
git fetch --multiple [<options>] [(<repository> | <group>)…]
git fetch --all [<options>]
```
