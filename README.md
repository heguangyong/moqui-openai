## A moqui-openaigpt component

moqui-openaigpt Component with: 

- data
- entities
- screens
- services
- REST API
- src

Create a new moqui component

To use run the following with moqui-framework [226f4826f97a0300d704b55a3aa63298aedd9acc](https://github.com/moqui/moqui-framework/pull/636/commits/226f4826f97a0300d704b55a3aa63298aedd9acc) or later:

```bash
./gradlew createComponent -Pcomponent=your-component
```

See [this](https://forum.moqui.org/t/moqui-moqui-openaigpt-component/725/7) for context


要将本地的子项目从 IntelliJ IDEA 推送到 GitHub 上，可以按照以下步骤进行操作：

### 前提条件
1. 你已经在 GitHub 上创建了一个空的仓库。
2. 你的本地计算机上已经安装并配置好了 Git（包括用户名和邮箱）。
3. IntelliJ IDEA 已经关联了 Git 版本控制。

### 步骤：

#### 1. 在 GitHub 上创建仓库
- 进入 GitHub，点击右上角的 `+` 按钮，选择 `New repository`。
- 为你的仓库命名并创建。注意不要勾选创建 README 文件或 .gitignore 文件（如果你还没有在本地创建这些文件）。

#### 2. 打开 IntelliJ IDEA
- 打开你已经创建好的子项目。
- 确保项目已经启用了 Git。如果没有启用，请在项目目录中右键选择 `Git` -> `Enable Version Control Integration` -> `Git`。

#### 3. 初始化 Git 仓库（如果尚未初始化）
如果你的子项目还没有初始化 Git 仓库，先初始化：

- 在 IntelliJ IDEA 中，点击 `Terminal`，然后输入以下命令：
  ```bash
  git init
  ```

#### 4. 添加远程仓库
- 在 GitHub 上找到刚创建的仓库的 URL（SSH 或 HTTPS）。
- 在终端中添加远程仓库：
  ```bash
  git remote add origin <your-repository-url>
  ```

#### 5. 将文件添加到 Git 并提交
- 在 IntelliJ IDEA 中，右键单击项目根目录，选择 `Git` -> `Add`，将文件添加到 Git 中。
- 或者在终端中手动运行：
  ```bash
  git add .
  ```

- 提交文件：
  ```bash
  git commit -m "Initial commit"
  ```

#### 6. 推送到 GitHub
- 在终端中运行以下命令将提交推送到 GitHub 仓库：
  ```bash
  git push -u origin master
  ```

#### 7. 验证推送结果
- 打开 GitHub，刷新你的仓库页面，确认文件已经成功推送上去。

### 注意事项：
- 如果你的 GitHub 仓库使用的是 `main` 分支而不是 `master`，推送时需要替换分支名称：
  ```bash
  git push -u origin main
  ```
