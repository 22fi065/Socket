# モジュールをインポートします
import hashlib

# 大きなバイナリデータを用意します
BigBinaryData = b'P4ssword'*0x100000

# ハッシュアルゴリズムを決めます
algo0='MD5'
algo='SHA1'
algo1 = 'SHA256'
import hashlib

def file_sha256(filename: str) -> str:
    """
    ファイル内容の SHA-256 ハッシュ値を計算し、16 進数文字列として取得します。
    """
    with open(filename, mode="rb") as file.:
        binary = f.read()
        return hashlib.sha256(binary).hexdigest()

        # Python 3.11 以降では次のようにも記述できます
        # return hashlib.file_digest(f, "sha256").hexdigest()

print(file_sha256("sample.py"))
# 分割せずにハッシュを計算する
h = hashlib.new(algo0)
h.update(BigBinaryData)
print(algo0,h.hexdigest())
h = hashlib.new(algo)
h.update(BigBinaryData)
print(algo,h.hexdigest())
h = hashlib.new(algo1)
h.update(BigBinaryData)
print(algo1,h.hexdigest())