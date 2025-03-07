# Punya Kevin Adi Santoso
N = int(input())

def bikin_binary(N):
    def rekurs(current_string):
        if len(current_string) == N: #Base case sudah sampai N panjang string
            return [current_string]
        
        hasil = []
        hasil.extend(rekurs(current_string + '0')) #proses cabang tree kiri
         
        if not current_string or current_string[-1] != '1':
            hasil.extend(rekurs(current_string + '1')) #proses cabang tree kanan
        return hasil
    return rekurs('')

hasil = bikin_binary(N)

print(' '.join(hasil))